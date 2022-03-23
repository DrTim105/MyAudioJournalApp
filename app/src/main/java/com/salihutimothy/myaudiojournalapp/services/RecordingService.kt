package com.salihutimothy.myaudiojournalapp.services

import android.Manifest
import android.app.*
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.media.MediaRecorder
import android.os.Build
import android.os.IBinder
import com.salihutimothy.myaudiojournalapp.MainActivity
import com.salihutimothy.myaudiojournalapp.R
import com.salihutimothy.myaudiojournalapp.database.DBHelper
import com.salihutimothy.myaudiojournalapp.entities.RecordingItem
import java.io.File
import java.io.IOException
import java.util.*


class RecordingService : Service() {

    private var mediaRecorder: MediaRecorder = MediaRecorder()
    var mStartingTimeMillis: kotlin.Long = 0
    var mElapsedMillis: Long = 0
    private lateinit var file: File
    private lateinit var dbHelper: DBHelper
    var fileName: String? = null
    private lateinit var timer: Timer

    private val isRecording = false

    private val recordPermission: String = Manifest.permission.RECORD_AUDIO
    private val PERMISSION_CODE = 21

    companion object {
        var maxAmplitude = 0f
    }

    override fun onCreate() {
        super.onCreate()
        dbHelper = DBHelper(applicationContext)
    }

    override fun onBind(intent: Intent?): IBinder? {
        TODO("Not yet implemented")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        var notification = createNotification()
        startForeground(1, notification)
        startRecording()
        return START_STICKY
    }

    private fun createNotification(): Notification {
        val notificationChannelId = "ENDLESS SERVICE CHANNEL"

        // depending on the Android API that we're dealing with we will have
        // to use a specific method to create the notification
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val notificationManager =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager;
            val channel = NotificationChannel(
                notificationChannelId,
                "Audio Journal notifications channel",
                NotificationManager.IMPORTANCE_NONE
            ).let {
                it.description = "Audio Journal channel"
                it.enableLights(true)
                it.lightColor = Color.RED
                it.enableVibration(false)
                it
            }
            notificationManager.createNotificationChannel(channel)
        }

        val notificationIntent = newLauncherIntent(this)

        val intent = PendingIntent.getActivity(
            this, 0,
            notificationIntent, 0
        )
//        val pendingIntent: PendingIntent = Intent(this, MainActivity::class.java).let { notificationIntent ->
//            PendingIntent.getActivity(this, 0, notificationIntent, 0)
//        }

        val builder: Notification.Builder =
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) Notification.Builder(
                this,
                notificationChannelId
            ) else Notification.Builder(this)

        return builder
            .setContentTitle("Audio Journal")
            .setContentText("Recording...")
            .setContentIntent(intent)
            .setOngoing(true)
            .setSmallIcon(R.drawable.ic_placeholder)
            .build()
    }

    private fun newLauncherIntent(context: Context?): Intent? {
        val intent = Intent(context, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        intent.action = Intent.ACTION_MAIN
        intent.addCategory(Intent.CATEGORY_LAUNCHER)
        return intent
    }

    private fun startRecording() {
        val timeStampLong = System.currentTimeMillis() / 1000
        val timeStamp = timeStampLong.toString()
        timer = Timer()

        fileName = "mental note $timeStamp"

        file = File(
            applicationContext.getExternalFilesDir(null)
                .toString() + "/MySoundRec/" + fileName + ".mp3"
        )

        mediaRecorder = MediaRecorder()
        mediaRecorder.setAudioSource(MediaRecorder.AudioSource.VOICE_RECOGNITION)
        mediaRecorder.setOutputFormat(MediaRecorder.OutputFormat.MPEG_4)
        mediaRecorder.setOutputFile(file.absolutePath)
        mediaRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.AAC)
        mediaRecorder.setAudioEncodingBitRate(384000)
        mediaRecorder.setAudioSamplingRate(44100)
        mediaRecorder.setAudioChannels(1)



        try {
            mediaRecorder.prepare()
            mediaRecorder.start()
            mStartingTimeMillis = System.currentTimeMillis()
//            maxAmplitude = 1000f
            timer.schedule(object : TimerTask() {
                override fun run() {
                    maxAmplitude = mediaRecorder.maxAmplitude.toFloat()
                }
            }, 0, 100) //wait 0 ms before doing the action and do it evry 1000ms (1second)


        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    private fun stopRecording() {
        timer.cancel()
        mediaRecorder.stop()
        mElapsedMillis = (System.currentTimeMillis() - mStartingTimeMillis)
        mediaRecorder.release()
//        Toast.makeText(applicationContext, "Recording stopped ${file.absolutePath}", Toast.LENGTH_SHORT).show()

        // add to database
        val recordingItem =
            RecordingItem(fileName, file.absolutePath, mElapsedMillis, System.currentTimeMillis())

        dbHelper.addRecording(recordingItem)
    }

    override fun onDestroy() {
        stopRecording()
        super.onDestroy()
    }
}
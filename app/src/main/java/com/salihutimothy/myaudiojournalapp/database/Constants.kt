package com.salihutimothy.myaudiojournalapp.database

import java.util.*

object Constants {
    fun getPrompts(): ArrayList<String> {

        val journalPrompts = ArrayList<String>()

        journalPrompts.add("What do you wish you didn’t have to do today?")
        journalPrompts.add("What are your intentions for the day?")
        journalPrompts.add("What are you looking forward to today?")
        journalPrompts.add("What task has been weighing on your mind lately?")
        journalPrompts.add("How can you surpass your own expectations today?")
        journalPrompts.add("What are the three most important items on your to-do list today?")
        journalPrompts.add("What is your favorite way to start the day?")
        journalPrompts.add("What are your hobbies?")
        journalPrompts.add("What makes you feel cozy and safe?")
        journalPrompts.add("What is your ideal day like?")
        journalPrompts.add("What is an accomplishment you are very proud of?")
        journalPrompts.add("What is one of your most cherished memories and why?")
        journalPrompts.add("Who do you admire most?")
        journalPrompts.add("What one thing do you most need to get done today?")
        journalPrompts.add("What is worrying you at the moment?")
        journalPrompts.add("What is currently making you feel like you're being punched in the gut?")
        journalPrompts.add("What topics do you feel like an expert on?")
        journalPrompts.add("What makes your heart beat strongest?")
        journalPrompts.add("How do you define success?")
        journalPrompts.add("How would you describe your dream life?")
        journalPrompts.add("Who do you need to forgive, and why, and what’s stopping you from doing it today?")
        journalPrompts.add("What is the best advice you have ever been given?")
        journalPrompts.add("How do you deal with helplessness?")
        journalPrompts.add("How do you deal with letting go?")
        journalPrompts.add("Who do you care about most in the world?\n" + "Let them know it today!")
        journalPrompts.add("What does it mean to be good enough, and how do you know that you are?")
        journalPrompts.add("What did you really love doing as a kid but don’t really do anymore?")
        journalPrompts.add("If you could, what is the one thing you would change about your past?")
        journalPrompts.add("What makes you feel happy to be alive?")
        journalPrompts.add("What truth have you been refusing to admit to yourself?")
        journalPrompts.add("What are you the most scared of losing?")
        journalPrompts.add("What one event in your life has changed you the most?")
        journalPrompts.add("What are 3 things you are grateful for today?")
        journalPrompts.add("What is something you want to change about yourself? Why?")
        journalPrompts.add("Who do you trust most? Why?")
        journalPrompts.add("What are your career ambitions?")
        journalPrompts.add("Does your work drain you?")
        journalPrompts.add("What opinions have you held in the past but have since questioned or changed?")
        journalPrompts.add("What parts of your daily life cause stress, frustration, or sadness?")
        journalPrompts.add("What go-to coping strategies help you get through moments of pain?")
        journalPrompts.add("What is your favourite thing to do when feeling low?")
        journalPrompts.add("What aspects of your life are you most grateful for?")
        journalPrompts.add("What place makes you feel most peaceful?")
        journalPrompts.add("What helps you stay focused and motivated when you feel discouraged?")
        journalPrompts.add("What was the last book you read? How did you find it?")
        journalPrompts.add("Are you feeling stressed?")
        journalPrompts.add("What is a bad habit you would like to change?")
        journalPrompts.add("If you could start life again, would you? What would you change?")
        journalPrompts.add("Who is someone that inspires you and why?")
        journalPrompts.add("What kind of person do you aspire to be?")
        journalPrompts.add("What was a hobby you loved as a kid?")
        journalPrompts.add("What is your earliest memory?") // cute memory from ❤
        journalPrompts.add("Where would you like to visit the most?")
        journalPrompts.add("How are you feeling today?")
        journalPrompts.add("What is your favourite color, and why?")
        journalPrompts.add("What is your favourite book, and why?")
        journalPrompts.add("What is your favourite movie, and why?")
        journalPrompts.add("Who is your favourite artist, and why?")
        journalPrompts.add("What is your favourite food, and why?")
        journalPrompts.add("What are your views on religion?")
        journalPrompts.add("Do you have a philosophy of life? \\nIf so, what is it? \\nIf not, what is your method for making important decisions?")
        journalPrompts.add("Who is someone you miss?")
        journalPrompts.add("What is a book that has influenced you, and how?")
        journalPrompts.add("What is a song that has influenced you, and how?")
        journalPrompts.add("What is a tv program that has influenced you, and how?")
        journalPrompts.add("What is a movie that has influenced you, and how?")
        journalPrompts.add("What's something you disagree with about the way you were raised?")
        journalPrompts.add("How would you like your life to be when you're older?")
        journalPrompts.add("If you won the lottery, what would you do?")
        journalPrompts.add("What's a country you'd like to visit?")
        journalPrompts.add("What are 5 book titles you could write?")
        journalPrompts.add("What new thing have you learned recently?")
        journalPrompts.add("What would you do if money was no object?")
        journalPrompts.add("Record a message for your future self...")
        journalPrompts.add("What is one thing you would like to say to God?")
        journalPrompts.add("What is one thing you would like to say to your parents?")
        journalPrompts.add("What would the complete opposite of you look like?")
        journalPrompts.add("If you could master any skill, what would you choose?")
        journalPrompts.add("Where and how do you get your best ideas?")
        journalPrompts.add("Who are the most special people in your life?")
        journalPrompts.add("What is something you've always wanted to try?")
        journalPrompts.add("What is the most significant plot twist in your life?")
        journalPrompts.add("What do you care least about?")
        journalPrompts.add("What is the most ridiculous thing you've done because you were bored?")
        journalPrompts.add("When do you feel most out of place?")
        journalPrompts.add("Would you like to be famous?")
        journalPrompts.add("What is the most daring thing you have done till date?")
        journalPrompts.add("What are you most insecure about?")
        journalPrompts.add("Are you satisfied with the life you are living?")
        journalPrompts.add("What would your parents be surprised to learn about you?")
        journalPrompts.add("What's a controversial opinion you have?")
        journalPrompts.add("What's something you thought you'd grow out of but haven't?")
        journalPrompts.add("What age do you feel right now and why?")
        journalPrompts.add("How different was your life one year ago?")
        journalPrompts.add("What could you give a 40-minute presentation on with absolutely no preparation?")
        journalPrompts.add("If you could know the absolute and total truth to one question, what question would you ask?")
        journalPrompts.add("What would you want your tombstone to say?")
        journalPrompts.add("What are you most likely to become famous for?")
        journalPrompts.add("What makes a good life?")
        journalPrompts.add("What gives your life meaning?")
        journalPrompts.add("What has been the best decision you've made in your life so far?")
        journalPrompts.add("What are you afraid people see when they look at you?")
        journalPrompts.add("What do you want to be remembered for?")
        journalPrompts.add("What is the title of the current chapter of your life?")
        journalPrompts.add("Is there any food you absolutely hate?")
        journalPrompts.add("What do most people think is true about you, but isn't?")
        journalPrompts.add("If you had one day to live on Earth, what would you do?")
        journalPrompts.add("What are your top 5 values?")
        journalPrompts.add("What is the next step you can take today to improve your circumstances?")
        journalPrompts.add("What can you do today now that will make your life better?")
        journalPrompts.add("What can you do today now that will improve your circumstances? p(^-^)q")
        journalPrompts.add("How can you bring more awareness to your life today?")
        journalPrompts.add("What will change if you take more responsibility for your choices and actions today?")
        journalPrompts.add("How would you change if you were more self-accepting even when you make mistakes?")
        journalPrompts.add("How would you change if you were more accepting of all the parts of you?")
        journalPrompts.add("What can you do to raise your self-esteem today?")
        journalPrompts.add("What does self-responsibility mean to you?")
        journalPrompts.add("How can you treat yourself with more respect?")
        journalPrompts.add("How can you live more consciously?")
        journalPrompts.add("What would change if you valued your needs as top priority?")
        journalPrompts.add("What will change if you bring more awareness to your relationships today?")
        journalPrompts.add("What will change if you bring more awareness to your deepest needs and wants today?")
        journalPrompts.add("What can you do to boost your energy level today?")
        journalPrompts.add("Who is your favourite fiction author?")
        journalPrompts.add("Who is your favourite nonfiction author?")
        journalPrompts.add("Have you drank water today?")
        journalPrompts.add("What are you looking forward to today?")
        journalPrompts.add("Today was a good day because?")
        journalPrompts.add("What would make today great?")
        journalPrompts.add("How can you make someone else happy right now?")
        journalPrompts.add("What's something in your immediate environment that you've never noticed?")
        journalPrompts.add("How would you encourage a friend going through your current struggle?")
        journalPrompts.add("How is your current problem the best thing that has ever happened to you?")
        journalPrompts.add("What are your obligations today?")
        journalPrompts.add("What is something exciting you have to do today?")
        journalPrompts.add("What sort of lifestyle do you want right now? In the future?")
        journalPrompts.add("If you knew you couldn't fail, what would you do?")


        return journalPrompts
    }
}
package com.bridgeLabz;

public class MoodAnalyzer {
    public String moodAnalysis(String message){
        if (message.contains("I am in sad Mood")) {
            return "SAD";
        }else
            return "HAPPY";
    }
}

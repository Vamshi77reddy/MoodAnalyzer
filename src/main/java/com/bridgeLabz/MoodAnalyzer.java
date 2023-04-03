package com.bridgeLabz;

public class MoodAnalyzer {
    String message;

    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message) {
        super();
        this.message = message;
    }

    public String moodAnalysis() {
        try {
            if (message.contains("Sad"))
                return "SAD";
            return "HAPPY";
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }}
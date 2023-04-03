package com.bridgeLabz;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MoodAnalyzerTest {
    @Test
    public void givenMessageWhenSadReturnsSad() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String mood = moodAnalyser.moodAnalysis("I am sad ");
        Assertions.assertEquals("SAD",mood);
        System.out.println(mood);
    }
    @Test
    public void givenMessageWhenHappyReturnsHappy() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String mood= moodAnalyser.moodAnalysis("I am happy");
        Assertions.assertEquals("HAPPY",mood);
        System.out.println(mood);
    }

}

package com.bridgeLabz;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MoodAnalyzerTest {
    @Test
    public void givenMessageWhenSadReturnsSad() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String mood = moodAnalyser.moodAnalysis();
        Assertions.assertEquals("SAD",mood);
        System.out.println(mood);
    }
    @Test
    public void givenMessageWhenHappyReturnsHappy() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String mood= moodAnalyser.moodAnalysis();
        Assertions.assertEquals("HAPPY",mood);
        System.out.println(mood);
    }
    @Test
    public void givenMessageWhenNullReturnsHappy() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer(null);
        String mood = moodAnalyser.moodAnalysis();
        Assertions.assertEquals("HAPPY",mood);
        System.out.println(mood);
    }

}

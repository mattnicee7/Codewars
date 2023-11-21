package com.github.mattnicee7;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/*

Challenge Name: Highest Scoring Word
Challenge Author: PG1
Challenge Link: https://www.codewars.com/kata/57eb8fcdf670e99d9b000272

Challenge:
Given a string of words, you need to find the highest scoring word.

Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.

For example, the score of abad is 8 (1 + 2 + 1 + 4).

You need to return the highest scoring word as a string.

If two words score the same, return the word that appears earliest in the original string.

All letters will be lowercase and all inputs will be valid.

*/
public class HighestScoringWord {

    @Test
    public void sampleTests() {
        assertEquals("taxi", HighestScoringWord.high("man i need a taxi up to ubud"));
        assertEquals("volcano", HighestScoringWord.high("what time are we climbing up to the volcano"));
        assertEquals("semynak", HighestScoringWord.high("take me to semynak"));
    }

    @Test
    public void edgeCaseTests() {
        assertEquals("aa", HighestScoringWord.high("aa b"));
        assertEquals("b", HighestScoringWord.high("b aa"));
        assertEquals("bb", HighestScoringWord.high("bb d"));
        assertEquals("d", HighestScoringWord.high("d bb"));
        assertEquals("aaa", HighestScoringWord.high("aaa b"));
    }

    public static String high(String s) {
        String highestWord = "";

        for (String word : s.split(" "))
            if (getValueFromWord(word) > getValueFromWord(highestWord))
                highestWord = word;

        return highestWord;
    }

    private static int getValueFromWord(String s) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        int total = 0;

        for (char c : s.toCharArray())
            total += alphabet.indexOf(c) + 1;

        return total;
    }

}

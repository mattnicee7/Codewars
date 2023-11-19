package com.github.mattnicee7;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*

Challenge Name: Get the Middle Character
Challenge Author: Shivo
Challenge Link: https://www.codewars.com/kata/56747fd5cb988479af000028/

Challenge:
You are going to be given a word. Your job is to return the middle character of the word. If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.

#Examples:

Kata.getMiddle("test") should return "es"

Kata.getMiddle("testing") should return "t"

Kata.getMiddle("middle") should return "dd"

Kata.getMiddle("A") should return "A"
#Input

A word (string) of length 0 < str < 1000 (In javascript you may get slightly more than 1000 in some test cases due to an error in the test cases). You do not need to test for this. This is only here to tell you that you do not need to worry about your solution timing out.

#Output

The middle character(s) of the word represented as a string.
*/
public class GetTheMiddleCharacter {
    
    @Test
    public void evenTests() {
        assertEquals("es", GetTheMiddleCharacter.getMiddle("test"));
        assertEquals("dd", GetTheMiddleCharacter.getMiddle("middle"));
    }

    @Test
    public void oddTests() {
        assertEquals("t", GetTheMiddleCharacter.getMiddle("testing"));
        assertEquals("A", GetTheMiddleCharacter.getMiddle("A"));
    }

    public static String getMiddle(String word) {
        int wordLength = word.length();
        int half = wordLength / 2;

        return isEven(wordLength)
                ? word.substring(half - 1, half + 1)
                : String.valueOf(word.charAt(half));
    }

    private static boolean isEven(int x) {
        return x % 2 == 0;
    }

}

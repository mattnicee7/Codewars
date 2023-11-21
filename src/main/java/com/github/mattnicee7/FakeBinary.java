package com.github.mattnicee7;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/*

Challenge Name: Fake Binary
Challenge Author: PG1
Challenge Link: https://www.codewars.com/kata/57eae65a4321032ce000002d

Challenge:
Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.

Note: input will never be an empty string

*/
public class FakeBinary {

    @Test
    public void testSomething() {
        assertEquals("01011110001100111", FakeBinary.fakeBin("45385593107843568"));
        assertEquals("101000111101101", FakeBinary.fakeBin("509321967506747"));
        assertEquals("011011110000101010000011011", FakeBinary.fakeBin("366058562030849490134388085"));
    }

    public static String fakeBin(String numberString) {
        return numberString.chars()
                .mapToObj(c -> (char) c)
                .mapToInt(e -> Integer.parseInt(String.valueOf(e)))
                .map(e -> e < 5 ? 0 : 1)
                .mapToObj(String::valueOf)
                .reduce("", (s, e) -> s + e);
    }

}

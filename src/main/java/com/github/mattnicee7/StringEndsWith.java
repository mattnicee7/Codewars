package com.github.mattnicee7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*

Challenge Name: String ends with?
Challenge Author: jhoffner
Challenge Link: https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d/train/java

Challenge:
Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).

Examples:

solution('abc', 'bc') // returns true
solution('abc', 'd') // returns false

*/
public class StringEndsWith {

    private static void check(String str, String ending, boolean expected) {
        boolean result = StringEndsWith.solution(str, ending);
        assertEquals("Expected solution(\"" + str + "\", \"" + ending + "\") to return " + expected, expected, result);
    }

    @Test
    public void staticTests() {
        check("samurai", "ai", true);
        check("sumo", "omo", false);
        check("ninja", "ja", true);
        check("sensei", "i", true);
        check("samurai", "ra", false);
        check("abc", "abcd", false);
        check("abc", "abc", true);
        check("abcabc", "bc", true);
        check("ails", "fails", false);
        check("fails", "ails", true);
        check("this", "fails", false);
        check("this", "", true);
        check(":-)", ":-(", false);
        check("!@#$%^&*() :-)", ":-)", true);
        check("abc\n", "abc", false);
    }

    public static boolean solution(String str, String ending) {
        // Why not return str.endsWith(ending)?

        if (str.length() < ending.length())
            return false;

        int strIndex = 0;

        for (int i = ending.length(); i > 0; i--) {
            if (str.charAt(str.length() - strIndex - 1) != ending.charAt(i - 1))
                return false;

            strIndex++;
        }

        return true;
    }

}

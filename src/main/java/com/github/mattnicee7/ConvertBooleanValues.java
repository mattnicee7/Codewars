package com.github.mattnicee7;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/*

Challenge Name: Convert boolean values to strings 'Yes' or 'No'.
Challenge Author: weavermedia
Challenge Link: https://www.codewars.com/kata/53369039d7ab3ac506000467

Challenge:
Complete the method that takes a boolean value and return a "Yes" string for true, or a "No" string for false.

*/
public class ConvertBooleanValues {

    @Test
    public void testBoolToWord() {
        assertEquals(ConvertBooleanValues.boolToWord(true), "Yes");
        assertEquals(ConvertBooleanValues.boolToWord(false), "No");
    }

    public static String boolToWord(boolean b) {
        return b ? "Yes" : "No";
    }

}

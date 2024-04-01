package com.github.mattnicee7;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/*

Challenge Name: Duplicate Encoder
Challenge Author: obnounce
Challenge Link: https://www.codewars.com/kata/54b42f9314d9229fd6000d9c

Challenge:
The goal of this exercise is to convert a string to a new string where each character in the new string is
"(" if that character appears only once in the original string, or ")" if that character appears more than once in the
original string. Ignore capitalization when determining if a character is a duplicate.

Examples
"din"      =>  "((("
"recede"   =>  "()()()"
"Success"  =>  ")())())"
"(( @"     =>  "))(("

Notes
Assertion messages may be unclear about what they display in some languages. If you read "...It Should encode XXX",
the "XXX" is the expected result, not the input!

*/
public class DuplicateEncoder {

    @Test
    public void test() {
        assertEquals(")()())()(()()(",
                DuplicateEncoder.encode("Prespecialized"));
        assertEquals("))))())))",DuplicateEncoder.encode("   ()(   "));
    }

    private static String encode(String string) {
        final StringBuilder stringBuilder = new StringBuilder();

        final List<Character> characters = string.toLowerCase()
                .chars()
                .mapToObj(c -> (char) c)
                .toList();

        for (final char c: characters)
            stringBuilder.append((characters.stream().filter(c2 -> c2 == c).count() > 1) ? ")" : "(");

        return stringBuilder.toString();
    }

}

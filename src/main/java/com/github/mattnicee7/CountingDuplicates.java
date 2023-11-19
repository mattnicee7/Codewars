package com.github.mattnicee7;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*

Challenge Name: Counting Duplicates
Challenge Author: kgashok
Challenge Link: https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1

Challenge:
Count the number of Duplicates
Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.

Example
"abcde" -> 0 # no characters repeats more than once
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice

*/
public class CountingDuplicates {

    @Test
    public void abcdeReturnsZero() {
        assertEquals(0, CountingDuplicates.duplicateCount("abcde"));
    }

    @Test
    public void abcdeaReturnsOne() {
        assertEquals(1, CountingDuplicates.duplicateCount("abcdea"));
    }

    @Test
    public void indivisibilityReturnsOne() {
        assertEquals(1, CountingDuplicates.duplicateCount("indivisibility"));
    }

    @Test
    public void reallyLongStringContainingDuplicatesReturnsThree() {
        String testThousandA = new String(new char[1000]).replace('\0', 'a');
        String testHundredB = new String(new char[100]).replace('\0', 'b');
        String testTenC = new String(new char[10]).replace('\0', 'c');
        String test1CapitalA = new String(new char[1]).replace('\0', 'A');
        String test1d = new String(new char[1]).replace('\0', 'd');
        String test = test1d + test1CapitalA + testTenC +
                testHundredB + testThousandA;


        assertEquals(3, CountingDuplicates.duplicateCount(test));
    }

    public static int duplicateCount(String text) {
        text = text.toLowerCase();

        final Map<Character, Integer> characters = new HashMap<>();

        text.chars().mapToObj(character -> (char) character).forEach(character -> {
            if (characters.containsKey(character)) {
                int oldValue = characters.get(character);
                characters.replace(character, oldValue + 1);
            } else {
                characters.put(character, 1);
            }
        });

        return characters.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toList()).size();
    }


}

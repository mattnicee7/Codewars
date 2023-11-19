package com.github.mattnicee7;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*

Challenge Name: Isograms
Challenge Author: chunjef
Challenge Link: https://www.codewars.com/kata/54ba84be607a92aa900000f1

Challenge:
An isogram is a word that has no repeating letters, consecutive or non-consecutive.
Implement a function that determines whether a string that contains only letters is an isogram.
Assume the empty string is an isogram. Ignore letter case.

Example: (Input --> Output)

"Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case)

isIsogram "Dermatoglyphics" = true
isIsogram "moose" = false
isIsogram "aba" = false

*/
public class Isograms {

    @Test
    public void fixedTests() {
        assertEquals(true, Isograms.isIsogram("Dermatoglyphics"));
        assertEquals(true, Isograms.isIsogram("isogram"));
        assertEquals(false, Isograms.isIsogram("moose"));
        assertEquals(false, Isograms.isIsogram("isIsogram"));
        assertEquals(false, Isograms.isIsogram("aba"));
        assertEquals(false, Isograms.isIsogram("moOse"));
        assertEquals(true, Isograms.isIsogram("thumbscrewjapingly"));
        assertEquals(true, Isograms.isIsogram(""));
    }

    public static boolean isIsogram(String str) {
        str = str.toLowerCase();
        final Map<Character, Integer> values = new HashMap<>();

        for (char character : str.toCharArray())
            values.merge(character, 1, Integer::sum);

        return values.values()
                .stream()
                .noneMatch(i -> i != 1);
    }

}

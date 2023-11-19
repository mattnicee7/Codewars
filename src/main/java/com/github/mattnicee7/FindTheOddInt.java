package com.github.mattnicee7;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*

Challenge Name: Find the odd int
Challenge Author: rbuckley
Challenge Link: https://www.codewars.com/kata/54da5a58ea159efa38000836/

Challenge:
Given an array of integers, find the one that appears an odd number of times.

There will always be only one integer that appears an odd number of times.

Examples
[7] should return 7, because it occurs 1 time (which is odd).
[0] should return 0, because it occurs 1 time (which is odd).
[1,1,2] should return 2, because it occurs 1 time (which is odd).
[0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
[1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).

*/
public class FindTheOddInt {

    @Test
    public void findTest() {
        assertEquals(5, FindTheOddInt.findIt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));
        assertEquals(-1, FindTheOddInt.findIt(new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5}));
        assertEquals(5, FindTheOddInt.findIt(new int[]{20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5}));
        assertEquals(10, FindTheOddInt.findIt(new int[]{10}));
        assertEquals(10, FindTheOddInt.findIt(new int[]{1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1}));
        assertEquals(1, FindTheOddInt.findIt(new int[]{5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10}));
    }

    public static int findIt(int[] a) {
        final Map<Integer, Integer> values = new HashMap<>();

        for (int x : a)
            values.merge(x, 1, Integer::sum);

        return values.entrySet()
                .stream()
                .filter(e -> isOdd(e.getValue().intValue()))
                .findFirst()
                .get()
                .getKey();
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static boolean isOdd(int number) {
        return !isEven(number);
    }

}

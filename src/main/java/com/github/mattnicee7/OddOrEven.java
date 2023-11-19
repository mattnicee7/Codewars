package com.github.mattnicee7;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*

Challenge Name: Odd or Even?
Challenge Author: ethaning
Challenge Link: https://www.codewars.com/kata/5949481f86420f59480000e7/

Challenge:
Task:
Given a list of integers, determine whether the sum of its elements is odd or even.

Give your answer as a string matching "odd" or "even".

If the input array is empty consider it as: [0] (array with a zero).

Examples:
Input: [0]
Output: "even"

Input: [0, 1, 4]
Output: "odd"

Input: [0, -1, -5]
Output: "even"
Have fun!

*/
public class OddOrEven {

    @Test
    public void exampleTest() {
        assertEquals("odd", OddOrEven.oddOrEven(new int[] {2, 5, 34, 6}));
    }

    public static String oddOrEven(int[] array) {
        int totalSum = Arrays.stream(array).sum();

        return isEven(totalSum) ? "even" : "odd";
    }

    private static boolean isEven(int num) {
        return num % 2 == 0;
    }

}

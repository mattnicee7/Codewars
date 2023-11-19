package com.github.mattnicee7;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*

Challenge Name: Grasshopper - Summation
Challenge Author: danleavitt0
Challenge Link: https://www.codewars.com/kata/55d24f55d7dd296eb9000030/

Challenge:
Write a program that finds the summation of every number from 1 to num.
 The number will always be a positive integer greater than 0.

For example (Input -> Output):

2 -> 3 (1 + 2)
8 -> 36 (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8)

*/
public class GrasshopperSummation {

    @Test
    public void test1() {
        assertEquals(1,
                GrasshopperSummation.summation(1));
    }
    @Test
    public void test2() {
        assertEquals(36,
                GrasshopperSummation.summation(8));
    }

    public static int summation(int n) {
        int totalSum = 0;

        for (int i = 1; i <= n; i++)
            totalSum += i;

        return totalSum;
    }

}

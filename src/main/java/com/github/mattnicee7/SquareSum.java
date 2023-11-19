package com.github.mattnicee7;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*

Challenge Name: Square(n) Sum
Challenge Author: jhoffner
Challenge Link: https://www.codewars.com/kata/515e271a311df0350d00000f/

Challenge:
Complete the square sum function so that it squares each number passed into it and then sums the results together.

For example, for [1, 2, 2] it should return 9 because 1² + 2² + 2² = 9.

*/
public class SquareSum {

    public static int squareSum(int[] n) {
        int total = 0;

        for (int j : n)
            total += (int) Math.pow(j, 2);

        return total;
    }

    @Test
    public void testBasic() {
        assertEquals(9, SquareSum.squareSum(new int[]{1, 2, 2}));
        assertEquals(5, SquareSum.squareSum(new int[]{1, 2}));
        assertEquals(50, SquareSum.squareSum(new int[]{5, -3, 4}));
        assertEquals(0, SquareSum.squareSum(new int[]{}));
    }

}

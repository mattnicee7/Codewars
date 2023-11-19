package com.github.mattnicee7;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*

Challenge Name: Sum of Digits / Digital Root
Challenge Author: user578387
Challenge Link: https://www.codewars.com/kata/541c8630095125aba6000c00

Challenge:
Digital root is the recursive sum of all the digits in a number.

Given n, take the sum of the digits of n.
If that value has more than one digit, continue reducing in this way until a single-digit number is produced.
The input will be a non-negative integer.

Examples
    16  -->  1 + 6 = 7
   942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2

*/
public class DigitalRoot {

    public static int digitalRoot(int n) {
        char[] digits = String.valueOf(n).toCharArray();

        if (digits.length < 2)
            return n;

        int total = 0;

        for (char digit : digits) {
            total += Integer.parseInt(String.valueOf(digit));
        }

        if (String.valueOf(total).toCharArray().length > 1)
            total = digitalRoot(total);

        return total;
    }


    @Test
    public void test1() {
        assertEquals(7, DigitalRoot.digitalRoot(16));
    }

    @Test
    public void test2() {
        assertEquals(6, DigitalRoot.digitalRoot(456));
    }

}

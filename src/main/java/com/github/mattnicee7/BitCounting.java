package com.github.mattnicee7;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*

Challenge Name: Bit Counting
Challenge Author: xcthulhu
Challenge Link: https://www.codewars.com/kata/526571aae218b8ee490006f4

Challenge:
Write a function that takes an integer as input, and returns the number of bits that are equal to one in the binary representation of that number.
You can guarantee that input is non-negative.

Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case

*/
public class BitCounting {

    public static int countBits(int n) {
        return (int) Integer.toBinaryString(n)
                .chars()
                .boxed()
                .filter(c -> c == '1')
                .count();
    }

    @Test
    public void testGame() {
        assertEquals(5, BitCounting.countBits(1234));
        assertEquals(1, BitCounting.countBits(4));
        assertEquals(3, BitCounting.countBits(7));
        assertEquals(2, BitCounting.countBits(9));
        assertEquals(2, BitCounting.countBits(10));
    }

}

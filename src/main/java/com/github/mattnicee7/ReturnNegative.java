package com.github.mattnicee7;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*

Challenge Name: Return Negative
Challenge Author: Deantwo
Challenge Link: https://www.codewars.com/kata/55685cd7ad70877c23000102

Challenge:
In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?

Examples
Kata.makeNegative(1);  // return -1
Kata.makeNegative(-5); // return -5
Kata.makeNegative(0);  // return 0
Notes
The number can be negative already, in which case no change is required.
Zero (0) is not checked for any specific sign. Negative zeros make no mathematical sense.

*/
public class ReturnNegative {

    @Test
    public void test1() {
        assertEquals(-42, ReturnNegative.makeNegative(42));
    }

    public static int makeNegative(final int x) {
        return x < 0 ? x : -x;
    }

}

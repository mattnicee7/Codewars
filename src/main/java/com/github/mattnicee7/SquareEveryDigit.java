package com.github.mattnicee7;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.DoubleStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*

Challenge Name: Square Every Digit
Challenge Author: MysteriousMagenta
Challenge Link: https://www.codewars.com/kata/546e2562b03326a88e000020/

Challenge:
Welcome. In this kata, you are asked to square every digit of a number and concatenate them.

For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1. (81-1-1-81)

Example #2: An input of 765 will/should return 493625 because 72 is 49, 62 is 36, and 52 is 25. (49-36-25)

Note: The function accepts an integer and returns an integer.

Happy Coding!

*/
public class SquareEveryDigit {

    @Test
    public void test() {
        assertEquals(811181, SquareEveryDigit.squareDigits(9119));
        assertEquals(0, SquareEveryDigit.squareDigits(0));
    }

    public static int squareDigits(int n) {
        return Integer.parseInt(Arrays.stream(String.valueOf(n).split(""))
                .flatMapToDouble(i -> DoubleStream.of(Math.pow(Double.parseDouble(i), 2.0)))
                .mapToInt(i -> (int) i)
                .mapToObj(String::valueOf)
                .reduce("", (s, e) -> s + e));
    }

}

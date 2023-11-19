package com.github.mattnicee7;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*

Challenge Name: Find the unique number
Challenge Author: isqua
Challenge Link: https://www.codewars.com/kata/585d7d5adb20cf33cb000235

Challenge:
There is an array with some numbers. All numbers are equal except for one. Try to find it!

Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
It’s guaranteed that array contains at least 3 numbers.

The tests contain some very huge arrays, so think about performance.

*/
public class FindTheUniqueNumber {

    private double precision = 0.0000000000001;

    @Test
    public void sampleTestCases() {
        assertEquals(1.0, FindTheUniqueNumber.findUniq(new double[]{0, 1, 0}), precision);
        assertEquals(2.0, FindTheUniqueNumber.findUniq(new double[]{1, 1, 1, 2, 1, 1}), precision);
    }

    public static double findUniq(double arr[]) {
        final Map<Double, Integer> values = new HashMap<>();

        for (double number : arr) {
            if (values.containsKey(number)) {
                int oldValue = values.get(number);
                values.replace(number, oldValue + 1);
            } else {
                values.put(number, 1);
            }
        }

        return values.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst()
                .get()
                .getKey();
    }

}

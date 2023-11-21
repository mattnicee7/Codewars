package com.github.mattnicee7;

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

/*

Challenge Name: Persistent Bugger.
Challenge Author: joh_pot
Challenge Link: https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec

Challenge:
Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
which is the number of times you must multiply the digits in num until you reach a single digit.

For example (Input --> Output):

39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2)
4 --> 0 (because 4 is already a one-digit number)

*/
public class PersistentBugger {

    @Test
    public void basicTests() {
        assertEquals(3, PersistentBugger.persistence(39));
        assertEquals(0, PersistentBugger.persistence(4));
        assertEquals(2, PersistentBugger.persistence(25));
        assertEquals(4, PersistentBugger.persistence(999));
    }

    public static int persistence(long n) {
        if (n < 10)
            return 0;

        long result = multiply(n);
        int index = 1;

        while (result > 9) {
            result = multiply(result);
            index++;
        }

        return index;
    }

    private static long multiply(long n) {
        int[] array = Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        long total = array[0];

        for (int i = 1; i < array.length; i++)
            total *= array[i];

        return total;
    }

}

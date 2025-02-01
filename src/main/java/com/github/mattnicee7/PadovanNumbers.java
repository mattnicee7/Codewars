package com.github.mattnicee7;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

/*

Challenge Name: Padovan Numbers.
Challenge Author: Valek
Challenge Link: https://www.codewars.com/kata/5803ee0ed5438edcc9000087

The Padovan sequence is the sequence of integers defined by the initial values

P(0) = P(1) = P(2) = 1
and the recurrence relation

P(n) = P(n-2) + P(n-3)
The first few values of P(n) are:

1, 1, 1, 2, 2, 3, 4, 5, 7, 9, 12, 16, 21, 28, 37, 49, 65, 86, 114, 151, 200, 265, ...
Task
Your task is to write a method that returns nth Padovan number
 */
public class PadovanNumbers {

    @Test
    void testSomething() {
        assertEquals(1, PadovanNumbers.padovan(0));
        assertEquals(1, PadovanNumbers.padovan(1));
        assertEquals(1, PadovanNumbers.padovan(2));
        assertEquals(2, PadovanNumbers.padovan(3));
        assertEquals(2, PadovanNumbers.padovan(4));
        assertEquals(3, PadovanNumbers.padovan(5));
        assertEquals(4, PadovanNumbers.padovan(6));
        assertEquals(5, PadovanNumbers.padovan(7));
        assertEquals(7, PadovanNumbers.padovan(8));
        assertEquals(9, PadovanNumbers.padovan(9));
    }

    public static long padovan(int n) {
        long[] resultados = new long[n+3];

        for (int i = 0; i < 3; i++)
            resultados[i] = 1;

        for (int i = 3; i <= n; i++) {
            resultados[i] = resultados[i-2] + resultados[i-3];
        }

        return resultados[n];
    }

}

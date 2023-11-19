package com.github.mattnicee7;


import org.junit.Test;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*

Challenge Name: Descending Order
Challenge Author: TastyOs
Challenge Link: https://www.codewars.com/kata/5467e4d82edf8bbf40000155

Challenge:
Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.

Examples:
Input: 42145 Output: 54421

Input: 145263 Output: 654321

Input: 123456789 Output: 987654321

*/
public class DescendingOrder {

    @Test
    public void test_01() {
        assertEquals(0, DescendingOrder.sortDesc(0));
    }

    @Test
    public void test_02() {
        assertEquals(51, DescendingOrder.sortDesc(15));
    }

    @Test
    public void test_03() {
        assertEquals(987654321, DescendingOrder.sortDesc(912345678));
    }

    public static int sortDesc(final int num) {
        final String numString = String.valueOf(num);

        final Map<Character, Integer> values = new TreeMap<>(Collections.reverseOrder());

        for (char c : numString.toCharArray()) {
            values.merge(c, 1, Integer::sum);
        }

        final StringBuilder result = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : values.entrySet()) {
            result.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }

        return Integer.parseInt(result.toString());
    }

}

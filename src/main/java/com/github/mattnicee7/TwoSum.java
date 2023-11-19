package com.github.mattnicee7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

/*

Challenge Name: Two Sum
Challenge Author: wthit56
Challenge Link: https://www.codewars.com/kata/52c31f8e6605bcc646000082

Challenge:
Write a function that takes an array of numbers (integers for the tests) and a target number.
It should find two different items in the array that, when added together, give the target value.
The indices of these items should then be returned in a tuple / list (depending on your language) like so: (index1, index2).

For the purposes of this kata, some tests may have multiple answers; any valid solutions will be accepted.

The input will always be valid (numbers will be an array of length 2 or greater, and all of the items will be numbers;
target will always be the sum of two different items from that array).

Based on: http://oj.leetcode.com/problems/two-sum/

two_sum([1, 2, 3], 4) == {0, 2}

*/
public class TwoSum {

    static Stream<Arguments> basicTests() {
        return Stream.of(
                arguments(new int[]{1,2,3},          4,     new int[]{0,2}),
                arguments(new int[]{1234,5678,9012}, 14690, new int[]{1,2}),
                arguments(new int[]{2,2,3},          4,     new int[]{0,1}),
                arguments(new int[]{2,3,1},          4,     new int[]{1,2})
        );
    }

    @ParameterizedTest(name="numbers: {0}, target: {1}, expected: {2}")
    @MethodSource
    void basicTests(int[] numbers, int target, int[] expected) {
        int[] actual = TwoSum.twoSum(numbers.clone(), target);
        assertNotNull(actual, "Should return an array");
        assertEquals(2, actual.length, "Returned array must be of length 2");
        assertNotEquals(actual[0], actual[1], "Indices must be distinct");
        int num1 = numbers[actual[0]];
        int num2 = numbers[actual[1]];
        assertEquals(target, num1 + num2, String.format("Numbers %d, %d at positions %d, %d do not add up to target", num1, num2, actual[0], actual[1]));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int index1 = 0, index2 = 0;

        for (int i = 0; i < numbers.length; i++) {
            int firstValue = numbers[i];

            for (int j = i + 1; j < numbers.length; j++) {
                int secondValue = numbers[j];

                if (firstValue + secondValue == target) {
                    index1 = i;
                    index2 = j;
                    break;
                }

            }

        }

        return new int[]{index1, index2};
    }

}

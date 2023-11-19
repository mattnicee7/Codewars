package com.github.mattnicee7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertEquals;

/*

Challenge Name: Binary Addition
Challenge Author: garrettguy457
Challenge Link: https://www.codewars.com/kata/551f37452ff852b7bd000139

Challenge:
Implement a function that adds two numbers together and returns their sum in binary. The conversion can be done before, or after the addition.

The binary number returned should be a string.

Examples:(Input1, Input2 --> Output (explanation)))

1, 1 --> "10" (1 + 1 = 2 in decimal or 10 in binary)
5, 9 --> "1110" (5 + 9 = 14 in decimal or 1110 in binary)

*/
public class BinaryAddition {

    @ParameterizedTest(name = "a = {1}, b = {2}")
    @CsvSource(textBlock = """
                   10,    1,   1
                    1,    0,   1
                    1,    1,   0
                  100,    2,   2
               111111,   51,  12
    """)
    void sampleTests(String expected, int a, int b) {
        assertEquals(expected, BinaryAddition.binaryAddition(a, b));
    }

    public static String binaryAddition(int a, int b){
        return Integer.toBinaryString(a + b);
    }

}

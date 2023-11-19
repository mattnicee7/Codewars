package com.github.mattnicee7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*

Challenge Name: Create Phone Number
Challenge Author: xDranik
Challenge Link: https://www.codewars.com/kata/525f50e3b73515a6db000b83

Challenge:
Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.

Example:
CreatePhoneNumber.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"`
The returned format must be correct in order to complete this challenge.

Don't forget the space after the closing parentheses!

*/
public class CreatePhoneNumber {

    @Test
    public void tests() {
        assertEquals(
                "(123) 456-7890",
                CreatePhoneNumber.createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0})
        );
    }

    public static String createPhoneNumber(int[] numbers) {
        String phoneNumber = "";

        phoneNumber += "(" + getPhoneStringPart(numbers, 0, 2) + ")";
        phoneNumber += " " + getPhoneStringPart(numbers, 3, 5);
        phoneNumber += "-" + getPhoneStringPart(numbers, 6, 9);

        return phoneNumber;
    }

    private static String getPhoneStringPart(int[] numbers, int min, int max) {
        String value = "";

        for (int i = min; i <= max; i++)
            value += String.valueOf(numbers[i]);

        return value;
    }

}

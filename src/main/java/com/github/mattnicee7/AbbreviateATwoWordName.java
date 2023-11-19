package com.github.mattnicee7;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*

Challenge Name: Abbreviate a Two Word Name
Challenge Author: samjam48
Challenge Link: https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/

Challenge:
Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.

The output should be two capital letters with a dot separating them.

It should look like this:

Sam Harris => S.H

patrick feeney => P.F

*/
public class AbbreviateATwoWordName {

    @Test
    public void testFixed() {
        assertEquals("S.H", AbbreviateATwoWordName.abbrevName("Sam Harris"));
        assertEquals("P.F", AbbreviateATwoWordName.abbrevName("Patrick Feenan"));
        assertEquals("E.C", AbbreviateATwoWordName.abbrevName("Evan Cole"));
        assertEquals("P.F", AbbreviateATwoWordName.abbrevName("P Favuzzi"));
        assertEquals("D.M", AbbreviateATwoWordName.abbrevName("David Mendieta"));
    }

    public static String abbrevName(String name) {
        final String[] split = name.split(" ");

        return String.valueOf(split[0].charAt(0) + "." + split[1].charAt(0)).toUpperCase();
    }

}

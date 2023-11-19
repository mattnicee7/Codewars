package com.github.mattnicee7;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*

Challenge Name: Mumbling
Challenge Author: g964
Challenge Link: https://www.codewars.com/kata/5667e8f4e3f572a8f2000039/

Challenge:
This time no story, no theory. The examples below show you how to write function accum:

Examples:
accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"
The parameter of accum is a string which includes only letters from a..z and A..Z.

*/
public class Mumbling {

    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void test() {
        System.out.println("Fixed Tests accum");
        testing(Mumbling.accum("ZpglnRxqenU"), "Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu");
        testing(Mumbling.accum("NyffsGeyylB"), "N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb");
        testing(Mumbling.accum("MjtkuBovqrU"), "M-Jj-Ttt-Kkkk-Uuuuu-Bbbbbb-Ooooooo-Vvvvvvvv-Qqqqqqqqq-Rrrrrrrrrr-Uuuuuuuuuuu");
        testing(Mumbling.accum("EvidjUnokmM"), "E-Vv-Iii-Dddd-Jjjjj-Uuuuuu-Nnnnnnn-Oooooooo-Kkkkkkkkk-Mmmmmmmmmm-Mmmmmmmmmmm");
        testing(Mumbling.accum("HbideVbxncC"), "H-Bb-Iii-Dddd-Eeeee-Vvvvvv-Bbbbbbb-Xxxxxxxx-Nnnnnnnnn-Cccccccccc-Ccccccccccc");
    }

    public static String accum(String s) {
        s = s.toLowerCase();

        int index = 0;
        final StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            index++;
            final String charString = String.valueOf(c);

            result.append(charString.toUpperCase());

            for (int i = index - 1; i > 0; i--)
                result.append(charString.toLowerCase());

            if (index < s.length())
                result.append("-");
        }

        return result.toString();
    }

}

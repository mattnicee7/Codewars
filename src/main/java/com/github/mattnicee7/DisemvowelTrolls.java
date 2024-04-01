package com.github.mattnicee7;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*

Challenge Name: Disemwovel Trolls
Challenge Author: osuushi
Challenge Link: https://www.codewars.com/kata/52fba66badcd10859f00097e/

Challenge:
Trolls are attacking your comment section!

A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.

Your task is to write a function that takes a string and return a new string with all vowels removed.

For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".

Note: for this kata y isn't considered a vowel.

*/
public class DisemvowelTrolls {

    @Test
    public void FixedTests() {
        assertEquals("Ths wbst s fr lsrs LL!", DisemvowelTrolls.disemvowel("This website is for losers LOL!")
        );
        assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd", DisemvowelTrolls.disemvowel(
                "No offense but,\nYour writing is among the worst I've ever read"));
        assertEquals( "Wht r y,  cmmnst?", DisemvowelTrolls.disemvowel("What are you, a communist?"));
    }

    public static String disemvowel(String str) {
        return str.replaceAll("[aeiou]", "")
                .replaceAll("[AEIOU]", "");
    }

}

package com.github.mattnicee7;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*

Challenge Name: Opposites Attract
Challenge Author: jbarget
Challenge Link: https://www.codewars.com/kata/555086d53eac039a2a000083/

Challenge:
Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower each.
If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.

Write a function that will take the number of petals of each flower and return true if they are in love and false if they aren't.

*/
public class OppositesAttract {

    @Test
    public void testOddAndEven() {
        assertEquals(true, OppositesAttract.isLove(1, 4));
    }

    @Test
    public void testEvenAndEven() {
        assertEquals(false, OppositesAttract.isLove(2, 2));
    }

    @Test
    public void testOddAndOdd() {
        assertEquals(false, OppositesAttract.isLove(1, 1));
    }

    @Test
    public void testEvenAndOdd() {
        assertEquals(true, OppositesAttract.isLove(0, 1));
    }

    public static boolean isLove(final int flower1, final int flower2) {
        if (isEven(flower1) && !isEven(flower2))
            return true;
        else
            return isEven(flower2) && !isEven(flower1);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

}

package com.github.mattnicee7;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/*

Challenge Name: Build Tower
Challenge Author: 8fdafs2
Challenge Link: https://www.codewars.com/kata/576757b1df89ecf5bd00073b

Challenge:
Build a pyramid-shaped tower, as an array/list of strings, given a positive integer number of floors. A tower block is represented with "*" character.

For example, a tower with 3 floors looks like this:

[
  "  *  ",
  " *** ",
  "*****"
]
And a tower with 6 floors looks like this:

[
  "     *     ",
  "    ***    ",
  "   *****   ",
  "  *******  ",
  " ********* ",
  "***********"
]

*/
public class BuildTower {

    @Test
    public void basicTests() {
        assertEquals(String.join(",", "*"), String.join(",", BuildTower.towerBuilder(1)));
        assertEquals(String.join(",", " * ", "***"), String.join(",", BuildTower.towerBuilder(2)));
        assertEquals(String.join(",", "  *  ", " *** ", "*****"), String.join(",", BuildTower.towerBuilder(3)));
    }

    public static String[] towerBuilder(int nFloors) {
        if (nFloors == 0) {
            return new String[0];
        }

        final List<Boolean[]> tower = new ArrayList<>();
        int arrayLength = (nFloors * 2) - 1;

        for (int i = 0; i < nFloors; i++) {
            Boolean[] booleanArray = new Boolean[arrayLength];

            booleanArray[nFloors - 1] = true;
            tower.add(booleanArray);
        }

        Arrays.fill(tower.get(tower.size() - 1), true);

        for (int i = 1; i < nFloors - 1; i++) {
            final Boolean[] booleanArray = tower.get(i);

            for (int j = 1; j <= i; j++) {
                booleanArray[nFloors - 1 - j] = true;
                booleanArray[nFloors - 1 + j] = true;
            }
        }

        return tower.stream().map(t -> {
            final StringBuilder stringBuilder = new StringBuilder();

            for (Boolean e : t) {
                stringBuilder.append(e == null ? " " : "*");
            }

            return stringBuilder.toString();
        }).toList().toArray(new String[0]);
    }

}

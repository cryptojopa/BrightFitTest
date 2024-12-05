package org.example.task;

import org.javatuples.Pair;

import java.util.List;

public class Task8 {
    public static int tuple(List<Pair<Integer,Integer>> dominoList) {
        int sumUp = 0;
        int sumDown = 0;

        int oddEven = 0;
        int evenOdd = 0;
        int oddOdd = 0;

        for (Pair<Integer, Integer> domino : dominoList) {
            int upper = domino.getValue0();
            int lower = domino.getValue1();

            sumUp += upper;
            sumDown += lower;

            if (upper % 2 == 0 && lower % 2 != 0) evenOdd++;
            else if (upper % 2 != 0 && lower % 2 == 0) oddEven++;
            else if (upper % 2 != 0) oddOdd++;
        }

        if (sumUp % 2 == 0 && sumDown % 2 == 0) {
            return 0;
        }

        if (sumUp % 2 != sumDown % 2) {
            if (oddEven % 2 != evenOdd % 2) return -1;
            else if (oddEven == evenOdd) return 1;
        }

        if (sumUp % 2 != 0 && sumDown % 2 != 0) {
            if (oddEven == evenOdd && oddEven != 0 ) return 1;
            else return -1;
        }
        return 2;
    }
}

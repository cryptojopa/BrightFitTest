package org.example.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {

    public static void compare(int number1, int number2) {
        int sortedNum = sort(number1);
        System.out.println(sortedNum == number2 ? "OK" : "ERROR");
    }

    private static int sort(int number1) {
        List<Integer> numList = new ArrayList<>();

        while (number1 != 0) {
            numList.add(number1 % 10);
            number1 = number1 / 10;
        }

        Collections.sort(numList);

        if (numList.get(0) == 0) {
            int i = 1;
            while(numList.get(i) == 0) {
                i++;
            }
            Collections.swap(numList, 0, i);
        }

        return parseListToInt(numList);
    }

    private static int parseListToInt(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        list.forEach(sb::append);
        String str = sb.toString();
        return Integer.parseInt(str);
    }
}

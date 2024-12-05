package org.example.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Task4 {
    private static final List<Integer> sequence = List.of(4,7,44,47,74,77,444,447, 474, 477, 744, 747, 774, 777, 4444, 4447, 4474, 4477, 4744, 4747, 4774, 4777);

    public static void findIndexByNumberSimple(int number) {
        System.out.println(sequence.indexOf(number) + 1);
    }

    public static void findIndexByNumber(int number) {
        int index = 1;
        index += IntStream.range(0, sequence.size())
                .filter(i -> sequence.get(i) == number)
                .findFirst()
                .getAsInt();
        System.out.println(index);
    }
}

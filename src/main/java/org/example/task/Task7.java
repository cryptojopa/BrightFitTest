package org.example.task;

import java.util.ArrayList;
import java.util.List;

public class Task7 {
    public static void getSeatOrder(int n) {
        if (n == 1 || n == 2) {
            System.out.println(1);
            System.out.println(1);
            return;
        }

        if (n == 3) {
            System.out.println(2);
            System.out.println("1 3");
            return;
        }

        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                odd.add(i);
            } else {
                even.add(i);
            }
        }

        List<Integer> result = new ArrayList<>(even);
        result.addAll(odd);

        System.out.println(n);
        result.forEach(number -> System.out.print(number + " "));
    }
}

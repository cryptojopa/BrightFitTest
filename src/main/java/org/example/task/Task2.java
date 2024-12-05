package org.example.task;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task2 {
    public static void sort(String s) {
        System.out.println(Arrays.stream(s.split("\\+")).sorted().collect(Collectors.joining("+")));
    }
}

package org.example;


import org.example.task.Task1;
import org.example.task.Task2;
import org.example.task.Task4;
import org.example.task.Task7;

public class Main {
    public static void main(String[] args) {
        Task1.compare(3310, 1033);
        Task2.sort("1+1+3+1+3");
        Task4.findIndexByNumber(7);
        Task4.findIndexByNumberSimple(7);
        Task7.seat(1);
        Task7.seat(2);
        Task7.seat(3);
        Task7.seat(6);
    }
}
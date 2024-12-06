package org.example;


import org.example.task.*;

public class Main {
    public static void main(String[] args) {
        Task1.compare(3310, 1033);

        Task2.sort("1+1+3+1+3");

        Task4.findIndexByNumber(7);
        Task4.findIndexByNumberSimple(7);

        Task5.getAvailableSites();

        Task7.getSeatOrder(1);
        Task7.getSeatOrder(2);
        Task7.getSeatOrder(3);
        Task7.getSeatOrder(6);
    }
}
package org.example.task;

import org.javatuples.Pair;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task8Test {
    @Test
    void test1() {
        int result = Task8.tuple(List.of(
                new Pair<>(2,1),
                new Pair<>(1,2)
        ));
        assertEquals(1, result);
    }

    @Test
    void test2() {
        int result = Task8.tuple(List.of(
                new Pair<>(1,2),
                new Pair<>(2,1)
        ));
        assertEquals(1, result);
    }

    @Test
    void test3() {
        int result = Task8.tuple(List.of(
                new Pair<>(2,1),
                new Pair<>(2,1),
                new Pair<>(1,1)
        ));
        assertEquals(1, result);
    }

    @Test
    void test4() {
        int result = Task8.tuple(List.of(
                new Pair<>(1,2),
                new Pair<>(1,2),
                new Pair<>(1,1)
        ));
        assertEquals(1, result);
    }

    @Test
    void test5() {
        int result = Task8.tuple(List.of(
                new Pair<>(2,1),
                new Pair<>(2,1),
                new Pair<>(1,1)
        ));
        assertEquals(1, result);
    }

    @Test
    void test6() {
        int result = Task8.tuple(List.of(
                new Pair<>(1,1)
        ));
        assertEquals(-1, result);
    }

    @Test
    void test7() {
        int result = Task8.tuple(List.of(
                new Pair<>(1,1),
                new Pair<>(1,1),
                new Pair<>(1,1)
        ));
        assertEquals(-1, result);
    }

    @Test
    void test8() {
        int result = Task8.tuple(List.of(
                new Pair<>(1,1),
                new Pair<>(2,2)
        ));
        assertEquals(-1, result);
    }

    @Test
    void test9() {
        int result = Task8.tuple(List.of(
                new Pair<>(1,2)
        ));
        assertEquals(-1, result);
    }
}
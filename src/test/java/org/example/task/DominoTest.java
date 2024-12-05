package org.example.task;

import org.javatuples.Pair;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class DominoTest {

    @Test
    void test1() {
        int result = Task8.tuple(List.of(
                new Pair<>(2,2)
        ));
        assertEquals(0, result);
    }

    @Test
    void test2() {
        int result = Task8.tuple(List.of(
                new Pair<>(1,2)
        ));
        assertEquals(-1, result);
    }

    @Test
    void test3() {
        int result = Task8.tuple(List.of(
                new Pair<>(2,1)
        ));
        assertEquals(-1, result);
    }

    @Test
    void test4() {
        int result = Task8.tuple(List.of(
                new Pair<>(2,4),
                new Pair<>(6,8)
        ));
        assertEquals(0, result);
    }

    @Test
    void test5() {
        int result = Task8.tuple(List.of(
                new Pair<>(1,4),
                new Pair<>(2,3),
                new Pair<>(4,4)

        ));
        assertEquals(1, result);
    }

    @Test
    void test6() {
        int result = Task8.tuple(List.of(
                new Pair<>(1,2),
                new Pair<>(1,2),
                new Pair<>(2,1)

        ));
        assertEquals(-1, result);
    }

    @Test
    void test7() {
        int result = Task8.tuple(List.of(
                new Pair<>(1,1),
                new Pair<>(1,1),
                new Pair<>(1,1),
                new Pair<>(1,1)

        ));
        assertEquals(0, result);
    }

    @Test
    void test8() {
        int result = Task8.tuple(List.of(
                new Pair<>(1,1),
                new Pair<>(1,1),
                new Pair<>(1,1)
        ));
        assertEquals(-1, result);
    }


}
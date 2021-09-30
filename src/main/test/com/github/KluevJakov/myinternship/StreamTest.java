package com.github.KluevJakov.myinternship;

import com.github.KluevJakov.myinternship.tasks.StreamTask;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class StreamTest {
    @Test
    public void negativeCheck() {
        Map<Integer, List<String>> check = new HashMap<>();

        check.put(1, new ArrayList<>(Arrays.asList("o5")));

        assertEquals(check, StreamTask.groupByDigitNumbers(new int[]{-1, -4, 5}));
    }

    @Test
    public void oddEvenCheck() {
        Map<Integer, List<String>> check = new HashMap<>();

        check.put(1, new ArrayList<>(Arrays.asList("e2","o3","e4","o1")));

        assertEquals(check, StreamTask.groupByDigitNumbers(new int[]{2, 3, 4, 1}));
    }

    @Test
    public void digitsCheck() {
        Map<Integer, List<String>> check = new HashMap<>();

        check.put(1, new ArrayList<>(Arrays.asList("o1")));
        check.put(2, new ArrayList<>(Arrays.asList("o11")));
        check.put(3, new ArrayList<>(Arrays.asList("o111")));
        check.put(4, new ArrayList<>(Arrays.asList("o1111")));
        check.put(5, new ArrayList<>(Arrays.asList("o11111")));
        check.put(6, new ArrayList<>(Arrays.asList("o111111")));

        assertEquals(check, StreamTask.groupByDigitNumbers(new int[]{1, 11111, 1111, 111, 11, 111111}));
    }

    @Test
    public void allNegativeCheck() {
        Map<Integer, List<String>> check = new HashMap<>();

        assertEquals(check, StreamTask.groupByDigitNumbers(new int[]{-1, -22, -3, -444}));
    }

    @Test
    public void emptyArrayCheck() {
        Map<Integer, List<String>> check = new HashMap<>();

        assertEquals(check, StreamTask.groupByDigitNumbers(new int[]{}));
    }

    @Test
    public void zeroCheck() {
        Map<Integer, List<String>> check = new HashMap<>();

        check.put(1, new ArrayList<>(Arrays.asList("o3", "e0", "e0")));
        check.put(2, new ArrayList<>(Arrays.asList("o23", "o25", "e14")));
        check.put(3, new ArrayList<>(Arrays.asList("o453")));

        assertEquals(check, StreamTask.groupByDigitNumbers(new int[]{23, 3, 0, 453, -2, 25, 0, 14}));
    }
}
package com.github.KluevJakov.myinternship;

import com.github.KluevJakov.myinternship.tasks.StreamConvertTask;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class StreamConvertTest {
    @Test
    public void simpleCase() {
        Set<Integer> testSet = new HashSet<>();

        testSet.add(1);
        testSet.add(2);
        testSet.add(3);
        testSet.add(4);
        testSet.add(5);

        assertEquals(testSet, StreamConvertTask.convertArrayToSet(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void emptyArrayCase() {
        Set<Integer> testSet = new HashSet<>();

        assertEquals(testSet, StreamConvertTask.convertArrayToSet(new int[]{}));
    }

    @Test
    public void repeatingElementCase() {
        Set<Integer> testSet = new HashSet<>();

        testSet.add(1);
        testSet.add(2);

        assertEquals(testSet, StreamConvertTask.convertArrayToSet(new int[]{1, 2, 1, 1, 1, 2, 2}));
    }
}

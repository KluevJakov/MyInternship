package com.github.KluevJakov.myinternship;

import com.github.KluevJakov.myinternship.tasks.SubarrayTask;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubarrayTest {
    @Test
    public void simpleCase() {
        assertEquals(9, SubarrayTask.getSubarrayCount(new int[]{1, -2, 4, -5, 1}));
    }

    @Test
    public void zeroArrayCase() {
        assertEquals(0, SubarrayTask.getSubarrayCount(new int[]{0, 0, 0, 0, 0}));
    }

    @Test
    public void positiveArrayCase() {
        assertEquals(0, SubarrayTask.getSubarrayCount(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void negativeArrayCase() {
        assertEquals(15, SubarrayTask.getSubarrayCount(new int[]{-1, -2, -3, -4, -5}));
    }

    @Test
    public void emptyArrayCase() {
        assertEquals(0, SubarrayTask.getSubarrayCount(new int[]{}));
    }
}

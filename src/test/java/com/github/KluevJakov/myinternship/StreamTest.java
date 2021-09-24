package com.github.KluevJakov.myinternship;

import com.github.KluevJakov.myinternship.tasks.IfElseTask;
import com.github.KluevJakov.myinternship.tasks.StreamTask;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class StreamTest {
    @Test
    public void negativeCheck() {
        Map<Integer, List<String>> check = new HashMap<>();
        check.put(1,new ArrayList<>(Arrays.asList("o5")));

        assertEquals(check, StreamTask.groupByDigitNumbers(new int[]{-1, -4, 5}));
    }
}

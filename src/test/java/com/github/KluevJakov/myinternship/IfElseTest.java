package com.github.KluevJakov.myinternship;

import com.github.KluevJakov.myinternship.tasks.IfElseTask;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IfElseTest {
    private static final String pos = "Weird";
    private static final String neg = "Not Weird";

    @Test
    public void oddCheck() {
        assertEquals(pos, IfElseTask.solveTask(3));
    }

    @Test
    public void firstIfCheck() {
        assertEquals(neg, IfElseTask.solveTask(4));
    }

    @Test
    public void secondIfCheck() {
        assertEquals(pos, IfElseTask.solveTask(8));
    }

    @Test
    public void elseCheck() {
        assertEquals(neg, IfElseTask.solveTask(22));
    }

    @Test
    public void firstLeftCheck() {
        assertEquals(neg, IfElseTask.solveTask(2));
    }

    @Test
    public void firstRightCheck() {
        assertEquals(pos, IfElseTask.solveTask(5));
    }

    @Test
    public void secondLeftCheck() {
        assertEquals(pos, IfElseTask.solveTask(6));
    }

    @Test
    public void secondRightCheck() {
        assertEquals(pos, IfElseTask.solveTask(20));
    }
}
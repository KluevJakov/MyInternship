package com.github.KluevJakov.myinternship;

import com.github.KluevJakov.myinternship.tasks.IfElseTask;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IfElseTest {
    private static final String WEIRD = "Weird";
    private static final String NOT_WEIRD = "Not Weird";

    @Test
    public void oddCheck() {
        assertEquals(WEIRD, IfElseTask.solveTask(3));
    }

    @Test
    public void firstIfCheck() {
        assertEquals(NOT_WEIRD, IfElseTask.solveTask(4));
    }

    @Test
    public void secondIfCheck() {
        assertEquals(WEIRD, IfElseTask.solveTask(8));
    }

    @Test
    public void elseCheck() {
        assertEquals(NOT_WEIRD, IfElseTask.solveTask(22));
    }

    @Test
    public void firstLeftCheck() {
        assertEquals(NOT_WEIRD, IfElseTask.solveTask(2));
    }

    @Test
    public void firstRightCheck() {
        assertEquals(WEIRD, IfElseTask.solveTask(5));
    }

    @Test
    public void secondLeftCheck() {
        assertEquals(WEIRD, IfElseTask.solveTask(6));
    }

    @Test
    public void secondRightCheck() {
        assertEquals(WEIRD, IfElseTask.solveTask(20));
    }
}
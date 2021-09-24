package com.github.KluevJakov.myinternship;

import com.github.KluevJakov.myinternship.tasks.IfElseTask;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IfElseTest {
    @Test
    public void oddCheck() {
        assertEquals("Weird", IfElseTask.solveTask(3));
    }

    @Test
    public void firstIfCheck() {
        assertEquals("Not Weird", IfElseTask.solveTask(4));
    }

    @Test
    public void secondIfCheck() {
        assertEquals("Weird", IfElseTask.solveTask(8));
    }

    @Test
    public void elseCheck() {
        assertEquals("Not Weird", IfElseTask.solveTask(22));
    }
}

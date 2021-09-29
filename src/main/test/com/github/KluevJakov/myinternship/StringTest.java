package com.github.KluevJakov.myinternship;

import com.github.KluevJakov.myinternship.tasks.StringTask;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringTest {
    @Test
    public void simpleCase() {
        assertEquals("9\nNo\nHello Java", StringTask.solveTask("hello","java"));
    }

    @Test
    public void lengthCase() {
        assertEquals("6\nNo\nAaa Bbb", StringTask.solveTask("aaa","bbb"));
    }

    @Test
    public void greaterCase() {
        assertEquals("2\nNo\nA Z", StringTask.solveTask("a","z"));
    }

    @Test
    public void lesserCase() {
        assertEquals("2\nYes\nZ A", StringTask.solveTask("z","a"));
    }

    @Test
    public void upperCase() {
        assertEquals("10\nYes\nUPPER CHECK", StringTask.solveTask("UPPER","CHECK"));
    }

    @Test
    public void lowerCase() {
        assertEquals("10\nYes\nLower Check", StringTask.solveTask("lower","check"));
    }
}

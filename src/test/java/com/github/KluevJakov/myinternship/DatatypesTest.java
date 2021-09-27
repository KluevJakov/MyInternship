package com.github.KluevJakov.myinternship;

import com.github.KluevJakov.myinternship.tasks.DatatypesTask;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class DatatypesTest {
    String correctAnswer = " can be fitted in:\n";
    String incorrectAnswer = " can't be fitted anywhere.\n";
    String byteValue = "* byte\n";
    String shortValue = "* short\n";
    String intValue = "* int\n";
    String longValue = "* long\n";

    @Test
    public void byteLeftCheck() {
        DatatypesTask tester = new DatatypesTask();
        String check = -128 + correctAnswer + byteValue + shortValue + intValue + longValue;
        assertEquals(check, tester.solveTask(1, Arrays.asList("-128")));
    }

    @Test
    public void byteRightCheck() {
        DatatypesTask tester = new DatatypesTask();
        String check = 127 + correctAnswer + byteValue + shortValue + intValue + longValue;
        assertEquals(check, tester.solveTask(1, Arrays.asList("127")));
    }

    @Test
    public void shortLeftCheck() {
        DatatypesTask tester = new DatatypesTask();
        String check = -32768 + correctAnswer + shortValue + intValue + longValue;
        assertEquals(check, tester.solveTask(1, Arrays.asList("-32768")));
    }

    @Test
    public void shortRightCheck() {
        DatatypesTask tester = new DatatypesTask();
        String check = 32767 + correctAnswer + shortValue + intValue + longValue;
        assertEquals(check, tester.solveTask(1, Arrays.asList("32767")));
    }

    @Test
    public void intLeftCheck() {
        DatatypesTask tester = new DatatypesTask();
        String check = Integer.MIN_VALUE + correctAnswer + intValue + longValue;
        assertEquals(check, tester.solveTask(1, Arrays.asList("-2147483648")));
    }

    @Test
    public void intRightCheck() {
        DatatypesTask tester = new DatatypesTask();
        String check = Integer.MAX_VALUE + correctAnswer + intValue + longValue;
        assertEquals(check, tester.solveTask(1, Arrays.asList("2147483647")));
    }

    @Test
    public void longLeftCheck() {
        DatatypesTask tester = new DatatypesTask();
        String check = Long.MIN_VALUE + correctAnswer + longValue;
        assertEquals(check, tester.solveTask(1, Arrays.asList("-9223372036854775808")));
    }

    @Test
    public void longRightCheck() {
        DatatypesTask tester = new DatatypesTask();
        String check = Long.MAX_VALUE + correctAnswer + longValue;
        assertEquals(check, tester.solveTask(1, Arrays.asList("9223372036854775807")));
    }

    @Test
    public void outOfRangeLeftCheck() {
        DatatypesTask tester = new DatatypesTask();
        String check = "-9223372036854775809" + incorrectAnswer;
        assertEquals(check, tester.solveTask(1, Arrays.asList("-9223372036854775809")));
    }

    @Test
    public void outOfRangeRightCheck() {
        DatatypesTask tester = new DatatypesTask();
        String check = "9223372036854775808" + incorrectAnswer;
        assertEquals(check, tester.solveTask(1, Arrays.asList("9223372036854775808")));
    }
}

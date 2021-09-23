package com.github.KluevJakov.myinternship;

import com.github.KluevJakov.myinternship.tasks.DatatypesTask;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class DatatypesTest {
    @Test
    public void byteLeftCheck() {
        DatatypesTask tester = new DatatypesTask();

        String correctAnswer1 = "-128 can be fitted in:\n" +
                "* byte\n" +
                "* short\n" +
                "* int\n" +
                "* long\n";

        assertEquals(correctAnswer1,tester.solveTask(1, Arrays.asList("-128")));
    }

    @Test
    public void byteRightCheck() {
        DatatypesTask tester = new DatatypesTask();

        String correctAnswer2 = "127 can be fitted in:\n" +
                "* byte\n" +
                "* short\n" +
                "* int\n" +
                "* long\n";

        assertEquals(correctAnswer2,tester.solveTask(1, Arrays.asList("127")));
    }
}

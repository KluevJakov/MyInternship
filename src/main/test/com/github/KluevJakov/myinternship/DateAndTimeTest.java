package com.github.KluevJakov.myinternship;
import com.github.KluevJakov.myinternship.tasks.DateAndTimeTask;
import org.junit.Test;

import java.time.DayOfWeek;

import static org.junit.Assert.assertEquals;

public class DateAndTimeTest {
    @Test
    public void startYearCheck() {
        assertEquals(DayOfWeek.FRIDAY.toString(), DateAndTimeTask.findDay(1, 1, 2021));
    }

    @Test
    public void endYearCheck() {
        assertEquals(DayOfWeek.FRIDAY.toString(), DateAndTimeTask.findDay(12, 31, 2021));
    }
}

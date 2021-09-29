package com.github.KluevJakov.myinternship.tasks;

import java.time.DayOfWeek;
import java.util.Calendar;

public class DateAndTimeTask {
    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day - 1);
        return DayOfWeek.of(calendar.get(Calendar.DAY_OF_WEEK)).toString();
    }
}

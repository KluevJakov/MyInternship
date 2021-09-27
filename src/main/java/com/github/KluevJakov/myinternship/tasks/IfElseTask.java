package com.github.KluevJakov.myinternship.tasks;

public class IfElseTask {
    private static final String pos = "Weird";
    private static final String neg = "Not Weird";

    public static String solveTask(int n) {
        if (n % 2 != 0) {
            return pos;
        } else {
            if (n >= 2 && n <= 5) {
                return neg;
            } else if (n >= 6 && n <= 20) {
                return pos;
            } else {
                return neg;
            }
        }
    }
}

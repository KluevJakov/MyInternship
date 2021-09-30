package com.github.KluevJakov.myinternship.tasks;

public class IfElseTask {
    private static final String WEIRD = "Weird";
    private static final String NOT_WEIRD = "Not Weird";

    public static String solveTask(int n) {
        if (n % 2 != 0) {
            return WEIRD;
        } else {
            if (n >= 2 && n <= 5) {
                return NOT_WEIRD;
            } else if (n >= 6 && n <= 20) {
                return WEIRD;
            } else {
                return NOT_WEIRD;
            }
        }
    }
}
package com.github.KluevJakov.myinternship.tasks;

public class IfElseTask {
    public static String solveTask(int n) {
        if (n%2 != 0) {
            return "Weird";
        } else {
            if (n >= 2 && n <= 5) {
                return "Not Weird";
            } else if (n >= 6 && n <= 20) {
                return "Weird";
            } else {
                return "Not Weird";
            }
        }
    }
}

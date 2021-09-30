package com.github.KluevJakov.myinternship.tasks;

public class StringTask {
    public static String solveTask(String A, String B) {
        String result = A.length() + B.length() + "\n";

        if (A.compareTo(B) > 0) {
            result += "Yes\n";
        } else {
            result += "No\n";
        }

        result += A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1);

        return result;
    }
}
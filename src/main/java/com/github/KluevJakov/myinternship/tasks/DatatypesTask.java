package com.github.KluevJakov.myinternship.tasks;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DatatypesTask {

    public String solveTask(int count, List<String> longArray) {
        String result = "";
        for (int i = 0; i < count; i++) {
            if (!isLongAvailable(longArray.get(i))) {
                result += longArray.get(i)+" can't be fitted anywhere.\n";
                continue;
            }

            long currentCheck = Long.parseLong(longArray.get(i));

            result += longArray.get(i) + " can be fitted in:\n";

            if (currentCheck >= -Math.pow(2, 7) && currentCheck <= Math.pow(2, 7) - 1) {
                result += "* byte\n";
            }
            if (currentCheck >= -Math.pow(2, 15) && currentCheck <= Math.pow(2, 15) - 1) {
                result += "* short\n";
            }
            if (currentCheck >= -Math.pow(2, 31) && currentCheck <= Math.pow(2, 31) - 1) {
                result += "* int\n";
            }
            if (currentCheck >= -Math.pow(2, 63) && currentCheck <= Math.pow(2, 63) - 1) {
                result += "* long\n";
            }
        }
        return result;
    }

    public static boolean isLongAvailable(String str) {
        BigInteger temp = new BigInteger(str);
        return (temp.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0) && (temp.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0);
    }
}

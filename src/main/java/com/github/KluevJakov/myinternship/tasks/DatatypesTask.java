package com.github.KluevJakov.myinternship.tasks;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class DatatypesTask {
    public void startTask() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input count of values: ");
        int count = scanner.nextInt();
        List<String> longArray = new ArrayList<>();
        scanner.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.print("Input value " + (i + 1) + ": ");
            String currentCheck = scanner.nextLine();
            longArray.add(currentCheck);
        }

        System.out.println(solveTask(count,longArray));
    }

    public String solveTask(int count,List<String> longArray){
        String result = "";
        for (int i = 0; i < count; i++) {
            try {
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
            }catch (Exception e){
                result += longArray.get(i)+" can't be fitted anywhere.\n";
            }
        }
        return result;
    }
}

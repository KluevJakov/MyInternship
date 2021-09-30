package com.github.KluevJakov.myinternship.tasks;

import java.util.Arrays;

public class SubarrayTask {
    public static int getSubarrayCount(int[] array) {

        int negativeCounter = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int tempSum = 0;

                for (int k = i; k <= j; k++) {
                    tempSum += array[k];
                }

                if (tempSum < 0) {
                    negativeCounter++;
                }
            }
        }

        return negativeCounter;
    }
}

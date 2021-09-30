package com.github.KluevJakov.myinternship.tasks;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamConvertTask {
    public static Set<Integer> convertArrayToSet(int[] array) {
        return Arrays.stream(array).boxed().collect(Collectors.toSet());
    }
}

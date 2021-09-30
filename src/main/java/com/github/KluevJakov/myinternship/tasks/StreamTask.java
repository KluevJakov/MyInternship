package com.github.KluevJakov.myinternship.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTask {
    public static Map<Integer, List<String>> groupByDigitNumbers(int[] input) {

        return Arrays.stream(input)
                .filter(element -> element >= 0)
                .mapToObj(element -> element % 2 == 0 ? "e" + element : "o" + element)
                .collect(Collectors.groupingBy(element -> element.length() - 1));
    }
}

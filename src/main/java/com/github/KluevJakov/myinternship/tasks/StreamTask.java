package com.github.KluevJakov.myinternship.tasks;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTask {
    public static Map<Integer, List<String>> groupByDigitNumbers (int[] input) {

        Map<Integer, List<String>> result = Arrays.stream(input)
                .boxed()
                .filter(e -> e > 0)
                .sorted()
                .map(e -> e % 2 == 0 ? "e" + e : "o" + e)
                .collect(Collectors.toMap(
                        e -> e.length() - 1,
                        list -> new ArrayList<String>(Arrays.asList(list)),
                        (v1, v2) -> {
                            v1.addAll(v2);
                            return v1;
                        }
                ));

        return result;
    }
}

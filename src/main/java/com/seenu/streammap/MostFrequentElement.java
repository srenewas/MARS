package com.seenu.streammap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentElement {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Optional<Map.Entry<String, Long>> op = list.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());
        System.out.println(op.orElseThrow());
    }
}

package com.seenu.streammap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCount {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String,Long> li = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(li);
    }
}

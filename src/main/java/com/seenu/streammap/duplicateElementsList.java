package com.seenu.streammap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class duplicateElementsList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
       list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(f->f.getValue()>1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}

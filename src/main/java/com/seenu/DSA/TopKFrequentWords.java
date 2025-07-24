package com.seenu.DSA;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopKFrequentWords {
    public static void main(String[] args) {
        List<String> lists = Arrays.asList("java", "spring", "java", "kafka", "spring", "java", "Linux");
        lists.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((k,v)-> Long.compare(v.getValue(),k.getValue()))
                .limit(2)
                .forEach(System.out::println);
    }
}

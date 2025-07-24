package com.seenu.DSA;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class getMaxOccurringChar {
    public static void main(String[] args) {
        String s = "abbcccddddeeeee";
        s.chars()
                .mapToObj(m->String.valueOf((char)m))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .stream()
                .forEach(System.out::println);
    }
}

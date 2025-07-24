package com.seenu.DSA;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LongestSubstringWithoutRepeatingChar {
    public static void main(String[] args) {
        String s = "abcdefghiabc";
        Long l = s.chars()
                .mapToObj(m->String.valueOf((char)m))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(f->f.getValue()>1)
                .map(Map.Entry::getKey)
                .count();
        System.out.println(l);
    }
}

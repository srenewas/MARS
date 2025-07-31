package com.seenu.streammap;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstnonRepeatingCharacter {
    public static void main(String[] args) {
        String b = "swiss";
        String map  = b.chars()
                .mapToObj(m->String.valueOf((char)m))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(f->f.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst().orElseThrow();
        System.out.println(map);
    }
}

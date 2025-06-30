package com.seenu.streammap;

import org.springframework.data.mongodb.core.aggregation.ArrayOperators;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlatMapDemo {
    public static void main(String[] args) {
        List<List<String>> list = List.of(
                List.of("a","b"),
                List.of("c","d"),
                List.of("e","f")
        );
        List<String> l = list.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(l);






        Map<String, List<List<Integer>>> map = Map.of(
                "a", List.of(List.of(1, 2), List.of(3), List.of(1)),
                "b", List.of(List.of(4), List.of(5, 6))
        );

        List<Integer> fl = map.values().stream()
                .flatMap(List::stream)       // Flattens List<List<Integer>> to Stream<List<Integer>>
                .flatMap(List::stream)       // Flattens Stream<List<Integer>> to Stream<Integer>
                .collect(Collectors.toList());
        System.out.println(fl);
    }
}

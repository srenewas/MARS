package com.seenu.streammap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mapVSflatmap {
    public static void main(String[] args) {
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("A", "B"),
                Arrays.asList("C", "D")
        );
        nestedList.stream()
                .map(list -> list.stream())
                .forEach(s->System.out.println(s.toString()));  // prints stream objects

        nestedList.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);  // it will print flattened result

    }
}

package com.seenu.streammap;

import java.util.Arrays;
import java.util.List;

public class mapVSflatmap {
    public static void main(String[] args) {
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("A", "B"),
                Arrays.asList("C", "D")
        );
        nestedList.stream()
                .map(list -> list.stream())
                .forEach(s->System.out.println(s.toString()));  // prints stream objects java.util.stream.ReferencePipeline$Head@7cd84586  java.util.stream.ReferencePipeline$Head@30dae81

        nestedList.stream()
                .flatMap(list -> list.stream())
                .forEach(System.out::println);  // it will print flattened result [A B C D]
    }
}

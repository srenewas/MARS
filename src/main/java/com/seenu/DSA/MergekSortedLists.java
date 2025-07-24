package com.seenu.DSA;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MergekSortedLists {
    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(Arrays.asList(1,3,4),Arrays.asList(1,2,1),Arrays.asList(1,5,1,2,2));
        List<Integer> merged = list.stream()
                .flatMap(List::stream)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(merged);
    }
}

package com.seenu.DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,4);
        List<Integer> list2 = Arrays.asList(1,3,4);
        // Output : [1,1,2,3,4,4]

        List<Integer> merged = new ArrayList<>(list1);
        merged.addAll(list2);

        List<Integer> result = merged.stream().sorted().collect(Collectors.toList());
        System.out.println(result);
    }
}

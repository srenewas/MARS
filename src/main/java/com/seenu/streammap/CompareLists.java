package com.seenu.streammap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CompareLists {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 2, 3);
        List<Integer> list2 = Arrays.asList(2, 1, 3, 2);

       Boolean istrue = list1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .equals(list2.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
        System.out.println(istrue);

        List<Integer> list3 = Arrays.asList(1, 2, 2, 3);
        List<Integer> list4 = Arrays.asList(2, 1, 3, 2);
         Boolean is = new HashSet(list3).equals(new HashSet(list4));
        System.out.println(is);
    }
}

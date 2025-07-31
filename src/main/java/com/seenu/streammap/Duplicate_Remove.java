package com.seenu.streammap;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicate_Remove {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,1,2,3,4,4,4,5,5,1,6};
        List<Integer> list = Arrays.stream(a).boxed().distinct().collect(Collectors.toList());
        System.out.println(list);

        Set<Integer> set = Arrays.stream(a).boxed().collect(Collectors.toSet());
        System.out.println(set);
    }
}

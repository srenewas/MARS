package com.seenu.streammap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class retrieveRepeatedInt {
    public static void main(String[] args) {
        System.out.println("*************Simple_Way************");
        int[] a = {5,8,2,1,5,7,8,2,5};
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
       // Arrays.stream(a).filter(f->!set1.add(f)).boxed().forEach(System.out::println);
        Arrays.stream(a).filter(n->!set1.add(n)).boxed().forEach(set2::add);
        System.out.println(set2);


        System.out.println("*************Bit_Complicate************");
        Set<Integer> duplicates = Arrays.stream(a)
                .boxed() // Convert int to Integer
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Count occurrences
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1) // Keep only those with count > 1
                .map(Map.Entry::getKey) // Extract the number
                .collect(Collectors.toSet()); // Collect to Set for uniqueness
        System.out.println(duplicates);
    }
}
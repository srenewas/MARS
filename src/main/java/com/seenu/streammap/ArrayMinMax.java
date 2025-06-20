package com.seenu.streammap;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayMinMax {
    public static void main(String[] args) {
        int[] a = {5, 8, 1, 9, 20};
        //Arrays.stream(a).max().stream().boxed().forEach(System.out::println);
        int max = Arrays.stream(a).max().orElseThrow();
        int min = Arrays.stream(a).min().orElseThrow();
        System.out.println(min);
        System.out.println(max);
    }
}

package com.seenu.naya;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNumbers {
    public static void main(String[] args) {
        String[] s = {"1", "2", "3", "5", "a", "6", "7", "8", "-5", "4", "-3", "-2", "-1"};
        List<Integer> result = Arrays.stream(s)
                .filter(f->f.matches("-?\\d+"))
                .map(Integer::parseInt)
                .filter(f->f!=5 && f!=4 && f!=-5)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}

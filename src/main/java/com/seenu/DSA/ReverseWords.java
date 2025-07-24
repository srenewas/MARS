package com.seenu.DSA;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWords {
    public static void main(String[] args) {
        String Input = "hello world java";
        String[] token = Input.split(" ");
      List<String> l= Arrays.stream(token)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(l);
    }
}

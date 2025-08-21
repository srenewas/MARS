package com.seenu.streammap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntArrayStartswithDigit {
    public static void main(String[] args) {
        int[] numbers = {5,9,11,2,8,21,1};
        List<String> result = Arrays.stream(numbers)
                .boxed()
                .map(f->String.valueOf(f))
                .filter(f->f.startsWith("1"))
                .collect(Collectors.toList());
        System.out.println(result);
    }
}

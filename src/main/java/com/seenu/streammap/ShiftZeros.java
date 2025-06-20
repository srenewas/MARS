package com.seenu.streammap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.setAll;
import static java.util.Arrays.stream;

public class ShiftZeros {
    public static void main(String[] args) {
        int[] input = {0, 4, 0, 0, 0, 6, 7, 8, 0, 5, 7, 8};
        List<Integer> nonZeros =  Arrays.stream(input).filter(f->f!=0)
                .boxed()
                .collect(Collectors.toList());   // output: [4, 6, 7, 8, 5, 7, 8]
        List<Integer> zeros = Arrays.stream(input)
                .filter(f->f==0)
                .boxed()
                .collect(Collectors.toList());   // output: [0, 0, 0, 0, 0]
        nonZeros.addAll(zeros);
        System.out.println(nonZeros);            // output: [4, 6, 7, 8, 5, 7, 8, 0, 0, 0, 0, 0]
    }
}

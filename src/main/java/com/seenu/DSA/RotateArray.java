package com.seenu.DSA;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RotateArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int k = 3;
        int n = a.length;  // n=10

        List<Integer> l3 = IntStream.range(n - k, n)   // (n-k)->(10-3 = 7) means 7,10
                .mapToObj(i -> a[i])
                .collect(Collectors.toList());

        System.out.println(l3);

        List<Integer> l4 = IntStream.range(0, n - k)   // means 0,7 0=exclude & 7=include
                .mapToObj(i -> a[i])
                .collect(Collectors.toList());

        System.out.println(l4);

        l3.addAll(l4);
        System.out.println(l3); // Rotated array
    }
}

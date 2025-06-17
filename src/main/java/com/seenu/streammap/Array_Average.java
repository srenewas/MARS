package com.seenu.streammap;

import java.util.Arrays;

public class Array_Average {
    public static void main(String[] args) {
        int[] a ={2,4,5,1,7,8,9};
        Arrays.stream(a).average().stream().forEach(System.out::println);
    }
}
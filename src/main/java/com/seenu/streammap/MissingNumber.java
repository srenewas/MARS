package com.seenu.streammap;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 6, 7};
        int n =7;
        int expectedNumber = n*(n+1)/2;
        int actualValue = Arrays.stream(nums).sum();
        int result = expectedNumber-actualValue;
        System.out.println(result);
    }
}

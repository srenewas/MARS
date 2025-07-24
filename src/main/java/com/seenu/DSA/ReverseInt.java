package com.seenu.DSA;

public class ReverseInt {
    public static void main(String[] args) {
        int input = 12345;
        int output = Integer.parseInt(new StringBuilder(String.valueOf(input)).reverse().toString());
        System.out.println(output);
    }
}

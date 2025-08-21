package com.seenu.Palindroms;

public class Palindrom {
    public static void main(String[] args) {
        String s = "madam";
        String sb =  new StringBuilder(s).reverse().toString();
        Boolean isPalidrom = s.equals(sb);
        System.out.println(isPalidrom);

        int a = 121;
        Integer aa = a;  // int is the primitive so, we cant call directly .equals() so, converting to Integer
        int reverse = Integer.parseInt(new StringBuilder(String.valueOf(a)).reverse().toString());
        Boolean isPalandrom = aa.equals(reverse);
        System.out.println(isPalandrom);
    }
}

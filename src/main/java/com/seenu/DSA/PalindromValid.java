package com.seenu.DSA;

import java.util.Arrays;

public class PalindromValid {
    public static void main(String[] args) {

        /*Input: s = "A man, a plan, a canal: Panama"
        Output: true
        Explanation: "amanaplanacanalpanama" is a palindrome.*/

        String s = "A man, a plan, a canal: Panama";
        String cleaned = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        System.out.println(cleaned);

        String reversed = new StringBuilder(cleaned).reverse().toString();
        System.out.println(reversed);
        System.out.println(cleaned.equals(reversed));


    }
}

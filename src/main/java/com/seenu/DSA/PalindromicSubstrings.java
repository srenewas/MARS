package com.seenu.DSA;

import java.util.HashSet;
import java.util.Set;

public class PalindromicSubstrings {

    public static void main(String[] args) {
        String input = "abba";
        Set<String> palindromes = findAllPalindromicSubstrings(input);
        System.out.println("Palindromic substrings: " + palindromes);
    }
    private static void expandAroundCenter(String s, int left, int right, Set<String> result) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            result.add(s.substring(left, right + 1));
            left--;
            right++;
        }
    }
    public static Set<String> findAllPalindromicSubstrings(String s) {
        Set<String> result = new HashSet<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            // Check for odd length palindromes
            expandAroundCenter(s, i, i, result);

            // Check for even length palindromes
            expandAroundCenter(s, i, i + 1, result);
        }
        return result;
    }
}


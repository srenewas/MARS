package com.seenu.Palindroms;

public class PalindromValid {
    public static void main(String[] args) {

        /*Input: s = "A man, a plan, a canal: Panama"
        Output: true
        Explanation: "amanaplanacanalpanama" is a palindrome.*/

        String s = "A man, a plan, a canal: Panama";
        String cleaned = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        System.out.println(cleaned);

        String reversed = new StringBuffer(cleaned).reverse().toString();
        System.out.println(reversed);
        System.out.println(cleaned.equals(reversed));
    }
}
/*
🔹 1. s.replaceAll("[^A-Za-z0-9]", "")
This removes all characters from the string that are not letters or digits.
It uses a regular expression:
        [^A-Za-z0-9] means: any character that is NOT (^)
*/

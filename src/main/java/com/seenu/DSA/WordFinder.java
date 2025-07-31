package com.seenu.DSA;

import java.util.*;

public class WordFinder {

    public static String find(List<String> words, String wordl) {
        int[] targetFreq = getFreq(wordl);

        return words.stream()
                .filter(word -> canForm(word, targetFreq))
                .findFirst()
                .orElse("-");
    }

    // Helper: Convert string to frequency array of size 26
    private static int[] getFreq(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;
        return freq;
    }

    // Helper: Check if word can be formed from given frequency array
    private static boolean canForm(String word, int[] targetFreq) {
        int[] wordFreq = getFreq(word);
        for (int i = 0; i < 26; i++) {
            if (wordFreq[i] > targetFreq[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("baby", "cat", "dada", "dog");
        System.out.println(find(words, "ctay"));  // Output: cat
        System.out.println(find(words, "dad"));   // Output: -
        System.out.println(find(words, "gdo"));   // Output: dog
        System.out.println(find(words, "ddaag"));// Output: dada
    }
}


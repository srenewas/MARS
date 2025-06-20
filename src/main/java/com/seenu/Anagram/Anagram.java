package com.seenu.Anagram;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("act", "pots", "tops", "cat","tac", "stop", "hat");
        Map<String, List<String>> map = new HashMap<>();
        for (String word:str){
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }
        List<List<String>> groupedAnagrams = new ArrayList<>(map.values());
        System.out.println(groupedAnagrams);
    }
}

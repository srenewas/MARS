package com.seenu.Anagram;

import java.util.*;
import java.util.stream.Collectors;

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


        String a = "listen";
        String b = "tenlis";
        String valuea = a.chars().mapToObj(m->(char)m).sorted().map(String::valueOf).collect(Collectors.joining());
        String valueb = b.chars().mapToObj(m->String.valueOf((char) m)).sorted().collect(Collectors.joining());
        System.out.println("Are the String Anagrams: "+valuea.equals(valueb));

        // Using Java Streams

        List<String> word = Arrays.asList("act", "pots", "tops", "cat","tac", "stop", "hat");
        Map<String, List<String>> result = word.stream()
                .collect(Collectors.groupingBy(
                        w -> w.chars()                                    // Convert word to IntStream of characters
                                .sorted()                                 // Sort characters (so anagrams become same key)
                                .mapToObj(c -> String.valueOf((char) c))  // Convert int to char then to String
                                .collect(Collectors.joining())            // Join sorted characters into a single string
                ));
        System.out.println(result);
    }
}

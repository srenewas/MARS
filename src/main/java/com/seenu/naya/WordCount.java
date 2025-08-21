package com.seenu.naya;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCount {
    public static void main(String[] args) {
        String s = "one two two three three three";
        String[] token = s.split(" ");
        Map<String, Integer> result = new HashMap<>();
        for (String word : token){
            result.put(word,result.getOrDefault(word,0)+1);
        }
        System.out.println(result);

        // Using Java Streams
        Map<String, Long> map = Arrays.stream(token)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(map);
    }
}

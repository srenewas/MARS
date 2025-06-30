package com.seenu.streammap;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCount {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String,Long> li = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(li);

        // We will get frequencyCount but, not in Insertion Order

        String s = "seenu";
        Map<Character,Long> map1 = s.chars().mapToObj(m->(char)m).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map1);

        // We will get frequencyCount in Insertion Order by using LinkedHashMap::new in terminal operation ie; collect

        String ss = "seenu";
        Map<Character,Long> map2 =
                ss.chars()
                        .mapToObj(m->(char)m)
                        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        System.out.println(map2);

        String s2 = "Hello World";
        Map<Character, Long> map = s2.chars()
                .mapToObj(m -> (char) m)
                .filter(f -> f != ' ')   // If you want to exclude the space between two words
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(map);  // O/P: {H=1, e=1, l=3, o=2, W=1, r=1, d=1}


    }
}

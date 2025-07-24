package com.seenu.streammap;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/*🧠 Explanation:
        s.chars() → stream of character codes (int).
        .mapToObj(c -> (char) c) → convert to Character.
groupingBy(..., counting()) → build a frequency map.
filter(...) → only keep entries with count > 1.
map(...) → extract just the characters.
collect(...) → gather into a set of duplicates.*/

public class retrieveRepeatedString {
    public static void main(String[] args) {
        String s ="seenunuuu";
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        //s.chars().distinct().mapToObj(c->(char) c).filter(n->set1.add(n)).forEach(System.out::println);

        s.chars().mapToObj(c->(char) c).filter(n-> !set1.add(n)).forEach(set2::add);
        System.out.println(set2);

        String s2 = "seenunuuu";
        long lo =  s2.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()>1)
                .count();
        System.out.println("Result : "+lo);




        String s3 = "seenunuuu";
        Set<Character> set = s3.chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        System.out.println(set);  //Repeated characters: [e, u, n]


        String s4 = "seenunuuu";
        Set<Character> set12 = s4.chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()==1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        System.out.println(set12);  //Repeated characters: [s]
    }
}

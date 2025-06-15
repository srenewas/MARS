package com.seenu.streammap;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Reverse_String {
    public static void main(String[] args) {
        String s = "buddu";
        //List<Character> ss = new StringBuilder(s).reverse().chars().mapToObj(c->(char)c).collect(Collectors.toList());
        //String ss = new StringBuilder(s).reverse().toString();
        //System.out.println(ss);
        //ss.chars().mapToObj(c->(char) c).forEach(System.out::println);

        String str = IntStream.range(0,s.length())      // gives indices 0 to n-1.
                .mapToObj(i->s.charAt(s.length()-1-i))  // We access characters in reverse order: s.length() - 1 - i.
                .map(String::valueOf)                   // Convert each char to String with String::valueOf.
                .collect(Collectors.joining());         // Use Collectors.joining() to create the final reversed string.
        System.out.println(str);


        String s3 = "seenu";
        IntStream.range(0,s3.length())
                .mapToObj(c->s3.charAt(s3.length()-1-c))
                .map(String::valueOf)
                .forEach(System.out::println);

    }
}

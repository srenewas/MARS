package com.seenu.streammap;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class letterUppercase {
    public static void main(String[] args) {
        List<String> list = List.of("seenu","sujju","buddu");
        List<String> li = list.stream().map(s->s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase()).collect(Collectors.toList());
        System.out.println(li);

        List<String> list2 = List.of("seenu","sujju","buddu");
        List<String> li2 = list2.stream().filter(s->s.startsWith("b")).map(s->s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase()).collect(Collectors.toList());
        System.out.println(li2);


        String s3 = "seenu";
        s3.chars()
                .limit(1)
                .mapToObj(c->(char) c)
                .map(r->s3.substring(0,1).toUpperCase()+s3.substring(1).toLowerCase())
                .forEach(System.out::println);

        String s4 = "seenu";
        String result = IntStream.range(0,s4.length())
                .mapToObj(i -> {
                    char c = s4.charAt(i);
                    if (i == 2) {
                        return Character.toString(Character.toUpperCase(c));
                    } else {
                        return Character.toString(c);
                    }
                })
                .collect(Collectors.joining());

        System.out.println(result);  // Output: sEenU
    }
}

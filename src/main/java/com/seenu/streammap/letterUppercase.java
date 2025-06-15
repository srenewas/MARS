package com.seenu.streammap;

import java.util.List;
import java.util.stream.Collectors;

public class letterUppercase {
    public static void main(String[] args) {
        List<String> list = List.of("seenu","sujju","buddu");
        List<String> li = list.stream().map(s->s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase()).collect(Collectors.toList());
        System.out.println(li);

        List<String> list2 = List.of("seenu","sujju","buddu");
        List<String> li2 = list2.stream().filter(s->s.startsWith("b")).map(s->s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase()).collect(Collectors.toList());
        System.out.println(li2);
    }
}

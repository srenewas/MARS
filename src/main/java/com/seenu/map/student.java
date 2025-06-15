package com.seenu.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class student {
    public void test (){
        List<String> list = new ArrayList<>();
        list.add("Sree");
        list.add("Sujju");
        list.add("Test");
        list.add("Apples");
        list.add(null);
        list.forEach(System.out::println);
        list.stream().filter(s-> s.startsWith("S")).forEach(System.out::println);
        list.stream().map(s->s.toUpperCase()).forEach(System.out::println);
        list.stream().filter(s->s.contains(null)).forEach(System.out::println);
    }
    public void testing(){
        Map<Integer,String> map = new HashMap<>();
        map.put(101,"seenu");
        map.put(102,"vasu");
        map.put(103,"sujju");
        map.put(104,"buddodu");
        map.values().stream().filter(s-> s.startsWith("s")).forEach(System.out::println);
        map.entrySet().stream().filter(s->s.getValue().startsWith("s")).forEach(System.out::println);
    }
    public static void main(String[] args) {
        student std = new student();
       // std.testing();
        std.test();




        /*List<String> list = new ArrayList<>();
        list.add("Seenu");
        list.add("Sujju");
        list.add("Buddu");
        list.forEach(System.out::println);

        List<String> list2 = List.of("Seenu","Sujju","Buddu");
        list2.forEach(System.out::println);*/

    }
}

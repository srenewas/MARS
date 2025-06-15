package com.seenu.streammap;

import java.util.List;

public class mapstream {
    public void List_of_Strings_to_Uppercase(){
        List<String> list = List.of("seenu","sujju","buddodu");
        System.out.println("******List_of_Strings_to_Uppercase****");
        list.stream().map(s->s.toUpperCase()).forEach(System.out::println);
    }
    public void Square_Each_Integer_in_a_List(){
        List<Integer> list = List.of(2,4,6,8,9);
        System.out.println("******Square_Each_Integer_in_a_List****");
        list.stream().map(s->s*s).forEach(System.out::println);
    }
    public void Map_a_List_of_Strings_to_Their_Lengths(){
        List<String> list = List.of("seenu","Sujju","Buddodu");
        System.out.println("******Map_a_List_of_Strings_to_Their_Lengths****");
        list.stream().map(s->s.length()).forEach(System.out::println);
    }
    public void Chaining_map_with_filter(){
        List<String> list = List.of("Seenu","Sujju","Buddodu");
        System.out.println("******Chaining_map_with_filter****");
        list.stream().filter(s->s.startsWith("S")).map(s->s.toUpperCase()).forEach(System.out::println);
    }
    public static void main(String[] args) {
        mapstream map = new mapstream();
        map.List_of_Strings_to_Uppercase();
        map.Square_Each_Integer_in_a_List();
        map.Map_a_List_of_Strings_to_Their_Lengths();
        map.Chaining_map_with_filter();
    }
}

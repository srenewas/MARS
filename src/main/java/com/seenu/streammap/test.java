package com.seenu.streammap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world");
        //list.stream().map(a->a.toUpperCase()).forEach(System.out::println);
       // list.stream().filter(d->d.startsWith("h")).map(d->d.toUpperCase()).forEach(System.out::println);
       // list.stream().filter(f->f.startsWith("h")).map(f->f.length()).forEach(System.out::println);
       // list.stream().filter(f->f.startsWith("h")).map(f->f.toLowerCase()).forEach(System.out::println);
        //list.stream().map(d->d.toUpperCase()).forEach(System.out::println);

        int[] a ={5,7,3,2,7,8,22,44,56,77,2,5};
        //Arrays.stream(a).filter(c->c%2!=0).forEach(System.out::println);
        //int sum = Arrays.stream(a).sum();
        //System.out.println(sum);
        /*Arrays.stream(a).filter(d->d%2==0).forEach(System.out::println);
        Arrays.stream(a).filter(f->f%2!=0).forEach(System.out::println);
        Set<Integer> set = new HashSet<>();
        List<Integer> li = Arrays.stream(a).filter(n->!set.add(n)).boxed().collect(Collectors.toList());
        System.out.println(li);*/

        /*String s ="seenusujju";
        String s2 = s.substring(0,5);
        Set<String>ss = s2.chars().mapToObj(c->(char) c).map(v->s2.toUpperCase()).collect(Collectors.toSet());
        System.out.println(ss);*/

        String ss = "seenu";
        //String s = new StringBuilder(ss).reverse().toString();
        //List<Character> s = new StringBuilder(ss).reverse().chars().mapToObj(c->(char)c).collect(Collectors.toList());
        //ss.chars().mapToObj(c->(char)c)
        String input = "buddakappa";
        Map<Character, Long> frequency = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequency);






        List<String> names = Arrays.asList("Ramu", "Seetha", "Laxmana", "Hanuma");
        //long ss = names.stream().filter(name->name.length()>3).collect(Collectors.counting());
       // String sss1 = names.stream().filter(name->name.length()>5).collect(Collectors.joining(","));
       // Set<String> sss2 = names.stream().filter(name->name.length()>5).collect(Collectors.toSet());
       // System.out.println(sss2);

        //names.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
        //names.stream().filter(s->s.startsWith("R")).forEach(System.out::println);
        //names.stream().map(s->s.toUpperCase()).forEach(System.out::println);

        String s = String.join(",",names);
        System.out.println(s);
        String sss = new StringBuilder(s).reverse().toString();
        System.out.println(sss);


    }
}

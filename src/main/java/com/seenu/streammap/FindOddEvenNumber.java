package com.seenu.streammap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindOddEvenNumber {
    public static void main(String[] args) {
        List<Integer> all = List.of(12,93,17,73,77,33,22,6,0);
        System.out.println("****************Only_Odd_Numbers****************");
        List<Integer> l1 = all.stream().filter(s->s%2!=0).collect(Collectors.toList()); // This will print only Odd Numbers
        System.out.println(l1);


        System.out.println("****************Only_Even_Numbers****************");
        List<Integer> l2 = all.stream().filter(s->s%2==0).collect(Collectors.toList()); // This will print only Even Numbers
        System.out.println(l2);

        System.out.println("****************Only_Even_Numbers****************");
        List<String> l3 = all.stream().map(s->s%2==0 ? "even" : "odd").collect(Collectors.toList());
        System.out.println(l3);

        int[] a = {5,4,2,9,8,4,0,1};
        System.out.println("*******************************");
        List<Integer> l4 = Arrays.stream(a).filter(d->d%2==0).boxed().collect(Collectors.toList());
        System.out.println(l4);
    }
}

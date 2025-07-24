package com.seenu.streammap;

import java.util.Arrays;
import java.util.List;

public class ReduceInStreams {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5};
        int aa = Arrays.stream(a).reduce(0,(x,y)->x+y);   // it will do addition if identify is 0
        System.out.println(aa);

        int a2 = Arrays.stream(a).reduce(1,(x,y)->x*y);  // it will do substraction if identify is 1
        System.out.println(a2);

        List<String> list =  Arrays.asList("i","am","java","developer");
        String s1 = list.stream().reduce("",(x,y)->x+y);
        System.out.println(s1);

        int a3 = Arrays.stream(a).reduce(0,(x,y)->Math.max(x,y));
        System.out.println(a3);


    }
}

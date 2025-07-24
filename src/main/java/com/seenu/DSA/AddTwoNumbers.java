package com.seenu.DSA;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AddTwoNumbers {
    public static void main(String[] args) {

        //Example:1
        int[] a = {2,3,4};
        int[] b = {5,6,7};
        int result1 = Arrays.stream(a).reduce(0,(acc,digit)->acc*10+digit);  //a = {2,3,4} to 234
        int result2 = Arrays.stream(b).reduce(0,(acc,digit)->acc*10+digit);  //b = {5,6,7} to 567
        System.out.println(result1+result2);  //234+567= 801

        //Example:2
        int reverseInt = 234;
        int reversed = Integer.parseInt(new StringBuilder(String.valueOf(reverseInt)).reverse().toString());
        System.out.println(reversed);  // 432

        //Example:3
        int[] x = {2,3,4};
        int[] y = {5,6,7};

        int reverseResult1 = IntStream.range(0,x.length).mapToObj(m->x[x.length-1 -m]).reduce(0,(acc,digit)->acc*10+digit);
        int reverseResult2 = IntStream.range(0,y.length).mapToObj(m->y[y.length-1 -m]).reduce(0,(acc,digit)->acc*10+digit);

        System.out.println(reverseResult1+reverseResult2); // 432+765 = 1197

        //Reverse two arrays and Add: 432+765=1197 Same as Example :3
        int[] a1 = {2,3,4};
        int[] b1 = {5,6,7};
        int value1 = Arrays.stream(a1).reduce(0,(c,d)->c*10+d);
        int v1 = Integer.parseInt(new StringBuilder(String.valueOf(value1)).reverse().toString());

        int value2 = Arrays.stream(b1).reduce(0,(c,d)->c*10+d);
        int v2 = Integer.parseInt(new StringBuilder(String.valueOf(value2)).reverse().toString());
        System.out.println(v1+v2);
    }
}

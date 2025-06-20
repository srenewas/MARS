package com.seenu.streammap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Digit_Divide {
    public static void main(String[] args) {
        int [] a = {3,4,6,1,8,9,34,12,};
        List<Double> result  = Arrays.stream(a)
                .asDoubleStream()                   // it converts int to double (so, you will get perfect output)
                .boxed()
                .map(m->m/2.5)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}

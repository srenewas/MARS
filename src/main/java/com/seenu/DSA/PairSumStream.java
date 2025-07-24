package com.seenu.DSA;

import java.util.stream.IntStream;

public class PairSumStream {
    public static void main(String[] args) {
        int [] num = {2,5,1,6,7,9,0,2,3};
        int target = 7;
        IntStream.range(0,num.length)
                .boxed()
                .flatMap(i->IntStream.range(i+1,num.length)
                                .filter(j->num[i]+num[j]==target)
                                .mapToObj(j->i+" "+j))
                .forEach(System.out::println);

    }
}

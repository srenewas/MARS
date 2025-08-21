package com.seenu.streammap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LogestString {
    public static void main(String[] args) {
        String[] input = {"java","programmer","Technology","code","coding"};
        int result = Arrays.stream(input)
                .mapToInt(String::length)
                .max()
                .orElseThrow();
        //System.out.println(result); // 10
        List<String> res =  Arrays.stream(input)
                .filter(f->f.length()==result)
                .collect(Collectors.toList());
        System.out.println(res);  //[programmer, Technology]
    }
}

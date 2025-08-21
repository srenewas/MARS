package com.seenu.Anagram;


import javax.crypto.spec.PSource;
import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.compare;
import static java.util.Arrays.stream;

final class test {
    public static boolean isvalidparantha(String s){
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()){
            if(ch=='[' || ch=='{' || ch=='('){
                stack.push(ch);
            }else{
                if (stack.empty()) return false;
                char top = stack.pop();
                if (ch==']' && top !='[' || ch=='}' && top !='{' || ch==')' && top !='(') return false;
            }

        }
        return stack.empty();
    }
    private static boolean isPrime(int num){
        if (num<=1) return false;
        return IntStream.rangeClosed(2,(int)Math.sqrt(num)).allMatch(n->num%n!=0);
    }
    public static void main(String[] args) {
        System.out.println(isvalidparantha("()"));
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple", "kiwi");


        List<Integer> list1 = Arrays.asList(1, 2, 2, 3,2,2,2,5);
        List<Integer> list2 = Arrays.asList(2, 1, 3, 2);



        int[] a ={2,4,5,1,7,8,9,2,5,6,1,4,2};


        int[] input = {0, 4, 0, 0, 0, 6, 7, 8, 0, 5, 7, 8};



        String s = "seenu";
;


        List<String> str = Arrays.asList("act", "pots", "tops", "cat","tac", "stop", "hat");


        String s1 = "stop";
        String s2 = "tops";


        // Merge and Sort
        List<Integer> lst1 = Arrays.asList(1,2,4);
        List<Integer> lst2 = Arrays.asList(1,3,4);


        //Reverse Int
        int i = 234;


        //Palindrome
        String ss = "madam";



        int ii = 11211;
        Integer parse = ii;



        String x = "abcdefghijabc";


        String b = "swiss";

        int[] arr = {4,8,11,23,41,6};


    }
}

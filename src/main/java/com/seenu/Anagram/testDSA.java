package com.seenu.Anagram;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class testDSA {


    private static boolean isPrime(int num){
        if (num<=0) return false;
        return IntStream.rangeClosed(2,(int)Math.sqrt(num)).allMatch(n->num%2!=0);
    }
    public static void main(String[] args) {

        //Add two arrays: 234+567=801
        int[] a = {2,3,4};
        int[] b = {5,6,7};


        //Reverse two arrays and Add: 432+765=1197
        int[] a1 = {2,3,4};
        int[] b1 = {5,6,7};



        //Best Time to buy Sell Stocks
        int[] prices = {7, 6, 5, 1, 6, 8};


        //Log Analyzer
        List<String> list = Arrays.asList(
                "2023-10-01T10:00:00 user1 LOGIN",
                "2023-10-01T10:05:00 user1 LOGOUT",
                "2023-10-01T10:06:00 user2 LOGIN");


        // Maximum Sub Array -> output : 6
        int[] num = {-2, 1, -3, 4, -1, 2, 1, -5, 4};


        //N Factorial
        int input =5;



        //rotate Array
        int[] a3 = {1,2,3,4,5,6,7,8,9,10};
        int k =3;
        int n = a3.length;

        CompletableFuture.supplyAsync(() -> "Hi")
                .thenApply(s -> s + " there!")
                .thenAccept(System.out::println);



    }
}

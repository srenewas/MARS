package com.seenu.naya;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Hackerank {

    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }

    public static  List<Integer> getPrime(int n){
         return IntStream.range(2,n)
                 .filter(f->IntStream.rangeClosed(2,(int)Math.sqrt(f)).allMatch(i->f%i!=0))
                 .boxed()
                 .collect(Collectors.toList());
    }

    public static char getMaxOccurringChar(String str) {
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        return freqMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get().getKey();
    }


    public static void main(String[] args) {
        Hackerank.fizzBuzz(15);
        System.out.println(Hackerank.getPrime(20));
        System.out.println(Hackerank.getMaxOccurringChar("abbcccddddeeeee"));
        System.out.println(Hackerank.getMaxOccurringChar("abcdefghabc"));
    }
}

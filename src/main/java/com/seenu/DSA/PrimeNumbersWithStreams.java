package com.seenu.DSA;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PrimeNumbersWithStreams {
    private static boolean isPrime(int number){
        if (number<=0) return false;
        return IntStream.rangeClosed(2,(int)Math.sqrt(number)).allMatch(n->number%n!=0);

    }
    public static void main(String[] args) {
        int[] a = {2, 5, 4, 7, 9, 8, 13, 21, 23};
        Arrays.stream(a)
                .filter(PrimeNumbersWithStreams::isPrime)
                .forEach(System.out::println);
    }
}

/*
if (number <= 1) return false;
Prime numbers must be greater than 1.
This line filters out 0, 1, and negative numbers.

return IntStream.rangeClosed(2, (int) Math.sqrt(number))
Creates a stream of numbers starting from 2 to the square root of the number.
For example, if number is 13, Math.sqrt(13) is approx 3.6, so the range is from 2 to 3.

.allMatch(n -> number % n != 0);
For each n in the range, check if number is not divisible by n.
If all numbers in that range don’t divide the number, then it's prime.
*/

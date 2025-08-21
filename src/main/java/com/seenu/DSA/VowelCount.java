package com.seenu.DSA;

import java.util.stream.IntStream;

public class VowelCount {
    public static void main(String[] args) {
        String name = "srinivas";
        int size =3;

        long maxVowels = IntStream.rangeClosed(0, name.length() - size)
                        .mapToLong(i -> name.substring(i, i + size)
                                .chars()
                                .filter(ch -> "aeiouAEIOU".indexOf(ch) != -1)
                                .count())
                        .max()
                        .orElse(0);

        System.out.println("Max vowel count: " + maxVowels);
    }
}

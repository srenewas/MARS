package com.seenu.streammap;
import java.util.stream.Collectors;

public class SortString {
    public static void main(String[] args) {
        String s = "seenunuuu";
        String sorted = s.chars()                         // IntStream of char codes
                .sorted()                                     // Sort the character codes
                .mapToObj(c -> String.valueOf((char) c))      // Convert int to String
                .collect(Collectors.joining());               // Join into sorted string
        System.out.println("Sorted string: " + sorted);


        String str = "seenu";
        String se = str.chars().mapToObj(c->(char)c).sorted().map(String::valueOf).collect(Collectors.joining());
        System.out.println(se);

        
    }
}

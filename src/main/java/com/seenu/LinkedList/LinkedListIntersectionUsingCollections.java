package com.seenu.LinkedList;

import java.util.*;

public class LinkedListIntersectionUsingCollections {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(2,5,1,10));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(1,3,7,10));

        // Using Streams
        int list = list1.stream()
                .filter(f->list2.contains(f))
                .findFirst().orElseThrow();
        System.out.println(list);


        // Using iterations
        Set<Integer> set = new HashSet<>(list1);

        for (int num : list2) {
            if (set.contains(num)) {
                System.out.println("Intersection found at value: " + num);
                return;
            }
        }

        System.out.println("No intersection found.");
    }
}

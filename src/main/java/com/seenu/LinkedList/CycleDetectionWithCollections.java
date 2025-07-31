package com.seenu.LinkedList;

import java.util.*;

public class CycleDetectionWithCollections {
    public static void main(String[] args) {
        // Simulating linked list nodes using a Map
        Map<Integer, Integer> simulatedList = new HashMap<>();
        simulatedList.put(1, 5);
        simulatedList.put(2, 3);
        simulatedList.put(3, 4);
        simulatedList.put(4, 2); // cycle here: 4 -> 2

        Integer current = 1;
        Set<Integer> visited = new HashSet<>();

        while (current != null) {
            if (visited.contains(current)) {
                System.out.println("Cycle detected at node: " + current);
                break;
            }
            visited.add(current);
            current = simulatedList.get(current);
        }

        if (current == null) {
            System.out.println("No cycle detected");
        }
    }
}

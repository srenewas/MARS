package com.seenu.MultiThreadding;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // By Default min-Heap
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(10);
        priorityQueue.add(45);
        priorityQueue.add(5);
        priorityQueue.add(30);
        priorityQueue.add(80);
        System.out.println("*******By Default min-Heap*****");
        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }

        //Max Heap
        PriorityQueue<Integer> priorityQueuemax = new PriorityQueue<>(Collections.reverseOrder());
        priorityQueuemax.add(10);
        priorityQueuemax.add(45);
        priorityQueuemax.add(5);
        priorityQueuemax.add(30);
        priorityQueuemax.add(80);
        System.out.println("*******Customized Max-Heap*****");
        while (!priorityQueuemax.isEmpty()){
            System.out.println(priorityQueuemax.poll());
        }

    }
}

/*🧠 When to Use:
Use PriorityQueue when:
You need efficient access to the "highest priority" item.
You are implementing algorithms like Dijkstra’s, A pathfinding*, Huffman encoding, task scheduling, etc.*/

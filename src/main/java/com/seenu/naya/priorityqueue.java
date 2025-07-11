package com.seenu.naya;

import java.util.Collections;
import java.util.PriorityQueue;

public class priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();  // Default natural sorting order
        minHeap.add(60);
        minHeap.add(10);
        minHeap.add(40);
        minHeap.add(30);
        minHeap.add(20);
        minHeap.add(50);
        while (!minHeap.isEmpty()){
           System.out.println(minHeap.poll());  // poll method is used to retrieve the data from queue
        }
        System.out.println("-----------------------");

       PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // Custom sorting order
        maxHeap.add(50);
        maxHeap.add(30);
        maxHeap.add(10);
        maxHeap.add(60);
        maxHeap.add(20);
        maxHeap.add(40);
        while(!maxHeap.isEmpty()){
            System.out.println(maxHeap.poll());
        }
    }
}


/*
🧠 Use Cases
Task scheduling (OS process queues)
Dijkstra’s algorithm (shortest path)
Huffman coding
Real-time systems (where tasks have priorities)
*/

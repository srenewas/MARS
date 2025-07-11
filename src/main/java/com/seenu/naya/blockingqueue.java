package com.seenu.naya;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class blockingqueue {
        public static void main(String[] args) {
            BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);

            // Producer
            Runnable producer = () -> {
                try {
                    for (int i = 1; i <= 10; i++) {
                        queue.put("Item " + i);
                        System.out.println("Produced: Item " + i);
                        Thread.sleep(500);
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            };

            // Consumer
            Runnable consumer = () -> {
                try {
                    for (int i = 1; i <= 10; i++) {
                        String item = queue.take();
                        System.out.println("Consumed: " + item);
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            };

            new Thread(producer).start();
            new Thread(consumer).start();
        }
}
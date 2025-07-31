package com.seenu.Anagram;


import java.util.concurrent.*;

public class executorService {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable task = () -> {
            System.out.println("Running task in: " + Thread.currentThread().getName());
        };

        executor.submit(task); // fire-and-forget
        executor.shutdown();   // shutdown after tasks complete
    }
}

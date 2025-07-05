package com.seenu.MultiThreadding;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executorservices {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);  // Creates a thread pool with 2 reusable threads.
        for (int i=1;i<20;i++){
            int taskId = i;
            executorService.submit(()->{
                System.out.println("Task"+ taskId + " running in thread: "+ Thread.currentThread().getName());
            });
        }
        executorService.shutdown();
    }
}

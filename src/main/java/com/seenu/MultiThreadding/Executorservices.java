package com.seenu.MultiThreadding;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Executorservices {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);  // Creates a thread pool with 2 reusable threads.
        for (int i=1;i<20;i++){
            int taskId = i;
            executorService.submit(()->{
                System.out.println("Task"+ taskId + " running in thread: "+ Thread.currentThread().getName());
            });
        }
        executorService.shutdown();
       // executorService.awaitTermination(3, TimeUnit.MINUTES);  // Best Practice if Wait for shutdown to complete
    }
}

/*
🔍 How it works:
A fixed pool of 5 threads is created.
You're submitting 19 tasks (i = 1 to 19).
The tasks will be picked up by any of the 5 threads in the pool — in parallel, up to 5 at a time.
Once all tasks are submitted, shutdown() is called to gracefully stop the executor.
*/

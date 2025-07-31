package com.seenu.MultiThreadding;

import java.util.concurrent.*;

public class ExecutorServiceMinMaxImplementation {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = new ThreadPoolExecutor(3,10,30L, TimeUnit.SECONDS,new LinkedBlockingDeque<>());
        for (int i = 1; i <= 20; i++) {
            int taskId = i;
            executorService.submit(() -> {
                System.out.println("Task " + taskId + " running in " + Thread.currentThread().getName());
                try { Thread.sleep(1000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            });
        }

        executorService.shutdown();
    }
}

/*
🧠 How it works:
        First 3 threads (core) are always active.
        If tasks > 3 and queue is full, it creates more threads up to 10.
        Extra threads beyond 3 will be terminated after 60 seconds of being idle.
*/

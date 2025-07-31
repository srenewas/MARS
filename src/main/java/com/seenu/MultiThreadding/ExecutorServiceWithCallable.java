package com.seenu.MultiThreadding;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable<String>{
    public String call() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 15; i++) {
            sb.append("Hey_Seenu").append(i).append("\n");
        }
        return sb.toString();
    }
}
public class ExecutorServiceWithCallable {
    public static void main(String[] args) throws Exception{
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // Submit Callable task and get a Future
        Future<String> future = executorService.submit(new MyCallable());

        // Block and get the result
        System.out.println(future.get());

        executorService.shutdown();
    }
}

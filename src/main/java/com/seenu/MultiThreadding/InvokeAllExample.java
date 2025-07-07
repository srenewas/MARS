package com.seenu.MultiThreadding;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class InvokeAllExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Callable<String>> list = Arrays.asList(
                ()->"Task-1",
                ()->"Task-2",
                ()->"Task-3"
        );

        List<Callable<String>> list2 = Arrays.asList(
                ()->{
                    Thread.sleep(1000);
                    return "Thread-1";
                },
                ()->{
                    Thread.sleep(1000);
                    return "Thread-2";
                },
                ()->{
                    Thread.sleep(1000);
                    return "Thread-3";
                }
        );

        // invokeAll method
        List<Future<String>> invokeall = executorService.invokeAll(list);

        // invokeAny method
        String invokeany = executorService.invokeAny(list2);
        for (Future<String> result : invokeall){
            System.out.println(result.get());
        }
        System.out.println("InvokeAny Result: "+invokeany);

        // After executing all existing task want to wait use below
        executorService.awaitTermination(3, TimeUnit.SECONDS);

        // shutdown the all ExecutorService
        executorService.shutdown();

        // Checking the ExecutorService is shutdown or not by using isShutdown() method
        if (executorService.isShutdown()){
            System.out.println("ExecutorService Shutdown Successfully.......");
        }else {
            System.out.println("Still Process is running");
        }
    }
}

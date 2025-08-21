package com.seenu.MultiThreadding;

import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EvenOddExecutor_Callable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Callable<List<Integer>> even = ()->{
            List<Integer> l1 = IntStream.range(0,100).boxed().filter(f->f%2==0).collect(Collectors.toList());
            System.out.println(Thread.currentThread().getName());
            return l1;
        };

        Callable<List<Integer>> odd = ()->{
           List<Integer> l2 =  IntStream.range(0,100).boxed().filter(f->f%2!=0).collect(Collectors.toList());
            System.out.println(Thread.currentThread().getName());
            return l2;
        };

        Future<List<Integer>> evenF1 = executorService.submit(even);
        Future<List<Integer>> oddF1 = executorService.submit(odd);

        System.out.println(evenF1.get());
        System.out.println(oddF1.get());

        executorService.shutdown();
        executorService.shutdown();
    }
}

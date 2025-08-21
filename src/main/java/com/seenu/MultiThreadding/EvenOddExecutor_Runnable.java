package com.seenu.MultiThreadding;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EvenOddExecutor_Runnable {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);  // This will use two threads one for even numbers and one for odd numbers

        Runnable even = ()->{
           List<Integer> l1 = IntStream.range(0,10).boxed().filter(f->f%2==0).collect(Collectors.toList());
            System.out.println(l1+Thread.currentThread().getName());
        };

        Runnable odd = ()->{
            List<Integer> l2 = IntStream.range(0,10).boxed().filter(f->f%2!=0).collect(Collectors.toList());
            System.out.println(l2+Thread.currentThread().getName());
        };

        executorService.submit(even);
        executorService.submit(odd);

        executorService.shutdown();
    }
}

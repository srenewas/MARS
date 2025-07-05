package com.seenu.MultiThreadding;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Mycollable implements Callable<String>{
    public String call(){
        return "Hello Sreenewas";
    }
}
public class executorserviceWithCollable {
    public static void main(String[] args) throws Exception{
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Future<String> future = executorService.submit(new Mycollable());
        System.out.println(future.get());
        executorService.shutdown();
    }
}

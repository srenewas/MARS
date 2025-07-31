package com.seenu.MultiThreadding;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRunnables implements Runnable{
    public void run(){
        StringBuilder sb = new StringBuilder();
        for (int i=1;i<=15;i++){
            sb.append("hey_Sree").append(i).append("\n");
        }
        System.out.println(sb);
    }
        }
public class ExecutorServiceWithRunnable {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(new MyRunnables());
        executorService.shutdown();

    }
}

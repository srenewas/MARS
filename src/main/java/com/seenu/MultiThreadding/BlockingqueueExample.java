package com.seenu.MultiThreadding;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockingqueueExample {
    public static void main(String[] args) throws InterruptedException {
        BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>(3);
        int POISON_PILL = -1;

        Thread producer = new Thread(()->{
            try {
                for (int i=1;i<=5;i++){
                    blockingDeque.put(i);
                    System.out.println("Producers :"+i);
                }
                blockingDeque.put(POISON_PILL);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });
        Thread consumer = new Thread(()->{
            try {
                Thread.sleep(1000);
                while (true){
                    int value = blockingDeque.take();
                    if (value==POISON_PILL){
                        System.out.println("Consumer recieved Shutdown Signal...");
                        break;
                    }
                    System.out.println("Consumer :"+value);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        producer.start();
        consumer.start();

        producer.join();
        consumer.join();

    }
}

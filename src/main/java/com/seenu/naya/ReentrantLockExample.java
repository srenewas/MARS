package com.seenu.naya;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    private final ReentrantLock lock = new ReentrantLock();
   private void message(){
       lock.lock();
       try {
           System.out.println("Acquire lock");
       }finally {
           lock.unlock();
       }
   }
    public static void main(String[] args) {
       ReentrantLockExample example = new ReentrantLockExample();
       Runnable run = example::message;
       Thread t = new Thread(run);
       t.start();

    }
}

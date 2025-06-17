package com.seenu.MultiThreadding;

class MyThread extends Thread {
    public void run() {
        for (int i=1;i<5;i++){
            System.out.println("User Thread: "+i);
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        for (int i=1;i<5;i++){
            System.out.println("Main Thread: "+i);
        }
    }
}

package com.seenu.MultiThreadding;

class MyTask implements Runnable {
    private String name;

    public MyTask(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " - Count: " + i);
            /*try {
                Thread.sleep(50);  // Pause for 500ms
            } catch (InterruptedException e) {
                System.out.println(name + " interrupted");
            }*/
        }
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyTask("Thread A"));
        Thread t2 = new Thread(new MyTask("Thread B"));
        Thread t3 = new Thread(new MyTask("Thread C"));

        t1.start();
        t2.start();
        t3.start();
    }
}


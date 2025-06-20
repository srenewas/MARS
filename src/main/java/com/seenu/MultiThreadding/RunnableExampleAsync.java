package com.seenu.MultiThreadding;

class MyRunnable implements Runnable{
    @Override
    public void run(){
        for (int i=1;i<100;i++){
            System.out.println("User Runnable Thread: "+i);
        }
    }
}
public class RunnableExampleAsync {
    public static void main(String[] args) throws Exception {
        MyRunnable mr = new MyRunnable();
        Thread thread = new Thread(mr);
        thread.start();
        for (int i=1;i<100;i++){

            System.out.println("Main Runnable Thread: "+i);
        }
    }
}

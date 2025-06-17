package com.seenu.MultiThreadding;
class MyRun implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println("User Thread: "+i);
        }
    }
}
public class RunnableExampleSync {
    public static void main(String[] args) throws Exception {
        MyRun myRun = new MyRun();
        Thread thread = new Thread(myRun);
        thread.start();
        thread.join();
        for (int i=0;i<100;i++){
            System.out.println("Main Thread: "+i);
        }
    }
}

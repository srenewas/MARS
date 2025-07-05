package com.seenu.MultiThreadding;

public class ByusingLamda {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            System.out.println("Hello Sreenewas");
        });
        thread.start();
    }
}

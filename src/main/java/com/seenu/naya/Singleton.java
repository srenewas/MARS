package com.seenu.naya;

public class Singleton {
    // Step 1: Create a private static variable to hold the single instance
    private static Singleton instance;

    // Step 2: Make the constructor private so no other class can instantiate it
    private Singleton() {
        System.out.println("Singleton instance created");
    }

    // Step 3: Provide a public static method to get the instance
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class){
               if (instance==null){
                   instance=new Singleton();
               }
            }
        }
        return instance;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        obj1.showMessage();

        Singleton obj2 = Singleton.getInstance();
        obj2.showMessage();

        System.out.println(obj1 == obj2); // true — both references point to the same instance
    }
}

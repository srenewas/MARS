package com.seenu.FunctionalInterface;

@FunctionalInterface
interface Greeting{
    void message(String name);
}
public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Greeting greet = n -> System.out.println("Hello "+n);
        greet.message("Sree");
    }
}

/*
🔍 Explanation:
@FunctionalInterface ensures only one abstract method is allowed.
Greeting is a functional interface.
Lambda expression implements it concisely.*/

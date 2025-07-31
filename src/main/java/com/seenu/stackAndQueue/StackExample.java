package com.seenu.stackAndQueue;

import java.util.Collections;
import java.util.Stack;
import java.util.stream.Collectors;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(90);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(55);
        stack.push(60);
        stack.push(70);
        stack.push(80);

        // Retrieving Elements from Stack and it follows LIFO structure
        Stack<Integer> s =  stack.stream().collect(Collectors.toCollection(Stack::new)); // it will pring as like this i.e FIFO
        Collections.reverse(s); // if need LIFO
        System.out.println(s);

        // Finding top Element from the Stack
        System.out.println(stack.peek());

        // Delete the element from Stack
        System.out.println("Deleted Element: "+stack.pop());
        System.out.println("After Delete :"+stack);

    }
}

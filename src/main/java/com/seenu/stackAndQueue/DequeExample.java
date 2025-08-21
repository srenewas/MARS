package com.seenu.stackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.push(1);
        deque.push(2);
        deque.push(3);
        deque.push(4);
        deque.push(5);
        deque.push(6);
        System.out.println(deque);
        System.out.println("Deleted :"+deque.pop());
        System.out.println("PEEK :"+deque.peek());

        Stack<Integer> stack = new Stack<>(); // Follows LIFO structure internally
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack);
        System.out.println("Deleted :"+stack.pop());
        System.out.println("PEEK :"+stack.peek());
    }
}

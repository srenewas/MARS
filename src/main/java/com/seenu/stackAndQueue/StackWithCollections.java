package com.seenu.stackAndQueue;

import java.util.LinkedList;
import java.util.Stack;
import java.util.stream.Collectors;

public class StackWithCollections {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        Stack<Integer> s = stack.stream().collect(Collectors.toCollection(Stack::new));
        System.out.println(s);

        System.out.println("With_pop() method......");
        stack.pop();
        Stack<Integer> s2 = stack.stream().collect(Collectors.toCollection(Stack::new));
        System.out.println(s2);
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());

    }
}

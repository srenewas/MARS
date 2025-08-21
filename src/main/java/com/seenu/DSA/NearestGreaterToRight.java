package com.seenu.DSA;

import java.util.*;

public class NearestGreaterToRight {
    public static List<Integer> nextGreaterElements(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();

        // Traverse from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            // Pop elements smaller than or equal to current
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // If stack is empty, no greater element to the right
            if (stack.isEmpty()) {
                result.add(-1);
            } else {
                result.add(stack.peek());
            }

            // Push current element onto the stack
            stack.push(arr[i]);
        }

        // Reverse the result since we processed from right to left
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        List<Integer> result = nextGreaterElements(arr);
        System.out.println(result);  // Output: [5, 10, 10, -1, -1]

    }
}


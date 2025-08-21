package com.seenu.streammap;

import java.util.Stack;

public class KDuplicateRemover {

    public static String removeDuplicates(String s, int k) {
        StringBuilder sb = new StringBuilder();
        Stack<int[]> stack = new Stack<>(); // [char, count]

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek()[0] == c) {
                stack.peek()[1]++;
            } else {
                stack.push(new int[]{c, 1});
            }

            if (stack.peek()[1] == k) {
                stack.pop();
            }
        }

        // Rebuild the final string
        for (int[] pair : stack) {
            for (int i = 0; i < pair[1]; i++) {
                sb.append((char) pair[0]);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "deeedbbcccbdaa";
        int k = 3;
        System.out.println(removeDuplicates(input, k)); // Output: "aa"
    }
}


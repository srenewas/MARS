package com.seenu.DSA;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValidParentheses(String s ){
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()){  // loop through each character
            // 1️⃣ If opening bracket → push to stack
            if (ch=='{' || ch=='(' || ch=='['){
                stack.push(ch);
            }else{
                // 2️⃣ If closing bracket → check conditions
                if (stack.empty()) return false; // no matching opening bracket
                char top = stack.pop(); // take the last opened bracket
                // 3️⃣ Check if it matches properly
                if (ch==')' && top !='(' || ch=='}' && top !='{' || ch==']' && top !='[') return false; // mismatch
            }
        }
        // 4️⃣ If stack is empty → all matched
        return stack.empty();
    }
    public static void main(String[] args) {
        System.out.println(isValidParentheses("()")); //true
        System.out.println(isValidParentheses("{[]}"));  //true
        System.out.println(isValidParentheses("([{}])")); //true
        System.out.println(isValidParentheses("{)")); //false

    }
}


/*
Step-by-step (Stack Trace):
Input: {[()]}
Stack initially: []
        { → opening → push → [{]
        [ → opening → push → [{, []
        ( → opening → push → [{, [, (]
        ) → closing:
check if it matches top → top is ( ✅ → pop
        stack now: [{, [ ]
] → closing:
    matches top [ ✅ → pop
    stack: [{ ]
    } → closing:
    matches top { ✅ → pop
        stack: []
✅ Final stack is empty → all brackets matched!
❌ What If Not Valid?
        Input: ([)]
        Stack:
        ( → push
                [ → push
) → expected [ on top, but found [ ❌ → mismatch → invalid
*/

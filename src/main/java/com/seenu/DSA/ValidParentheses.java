package com.seenu.DSA;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValidParentheses(String s ){
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()){
            if (ch=='{' || ch=='(' || ch=='['){
                stack.push(ch);
            }else{
                if (stack.empty()) return false;
                char top = stack.pop();
                if (ch==')' && top !='(' ||
                        ch=='}' && top !='{' ||
                        ch==']' && top !='['
                ) return false;
            }
        }
        return stack.empty(); // Should be empty if all brackets matched
    }

    public static void main(String[] args) {
        System.out.println(isValidParentheses("()"));
        System.out.println(isValidParentheses("{[]}"));
        System.out.println(isValidParentheses("([{}])"));
        System.out.println(isValidParentheses("{)"));

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

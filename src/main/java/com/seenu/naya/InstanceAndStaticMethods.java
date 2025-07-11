package com.seenu.naya;

public class InstanceAndStaticMethods {
        public static int addition(int a, int b){
            return a+b;
        }
        public int multiply(int a, int b){
            return a+b;
       }

    public static void main(String[] args) {
        int result = InstanceAndStaticMethods.addition(20,30);
        System.out.println(result);   // no need to create an object and obj creation is not allowedd in statis methos

        InstanceAndStaticMethods instancemethod = new InstanceAndStaticMethods();
        int instaresult = instancemethod.multiply(5,5);
        System.out.println(instaresult);  // Should create an obj for instance method
    }
    }

    /*🧠 When to Use What:
Use static methods when the behavior does not depend on instance data (like utility methods).
Use instance methods when you need to operate on object-specific data (like object properties).*/
package com.seenu.oldcode;
/*✅ == (Reference Comparison)
Compares whether two references point to the same object in memory.
        For primitives (like int, char), it compares values.
        For objects, it checks if both references point to the exact same instance.

  ✅ .equals() (Content Comparison)
Compares the contents (state) of two objects.
Can be overridden in user-defined classes to define equality meaningfully (e.g., in String, Integer, etc.).*/

public class Ref_and_Content_compare {
    public static void main(String[] args) {
        String s1 = "Seenu";
        String s2 = "Sujju";
        String s3 = "Sujju";
        String s4 = new String("Seenu");

        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s1==s4);

        System.out.println("Content Comparison: "+s1.equals(s2));
        System.out.println("Content Comparison: "+s2.equals(s3));
        System.out.println("Content Comparison: "+s1.equals(s4));
    }
}

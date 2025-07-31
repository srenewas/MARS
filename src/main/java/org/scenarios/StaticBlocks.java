package org.scenarios;
class A{
    static{
        System.out.println("A-->SB");
    }
    A(){
        System.out.println("A-->Con");
    }
    static int m1(){
        System.out.println("A-->M1");
        return 10;
    }
    static int i = m1();
}
class B extends A{
    static {
        System.out.println("B-->SB");
    }
}
class C extends B{
    static {
        System.out.println("C-->SB");
    }
}
public class StaticBlocks {
    public static void main(String[] args) {
        B c = new B();
    }
}

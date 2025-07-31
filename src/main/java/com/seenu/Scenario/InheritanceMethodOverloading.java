package com.seenu.Scenario;
class A{}
class B extends A{}
class C extends B{}
class D extends C{}
public class InheritanceMethodOverloading {
    static void overloadedMethod(A a){
        System.out.println("ONE");
    }
    static void overloadedMethod(B b){
        System.out.println("TWO");
    }
    static void overloadedMethod(C c){
        System.out.println("THREE");
    }
    static void overloadedMethod(D d){
        System.out.println("FOUR");
    }
    public static void main(String[] args) {
        D d = new D();
        A a = new A();
        B b = new C();
        overloadedMethod(d);
        overloadedMethod(a);
        overloadedMethod(b);
    }
}

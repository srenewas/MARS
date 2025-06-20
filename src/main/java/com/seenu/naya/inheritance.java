package com.seenu.naya;

class AA {
    void display(){
        System.out.println("Inside_AA.......");
    }
}
class B extends AA {
    void display(){
        System.out.println("Inside_B.......");
    }
}
class C extends AA{
    void display(){
        System.out.println("Inside_C.......");
    }
}
public class inheritance {
    public static void main(String[] args) {
        AA a = new AA();
        a.display();

        AA aa = new B();
        aa.display();

        AA aaa = new C();
        aaa.display();

        B b = new B();
        b.display();

        C c = new C();
        c.display();

    }
}

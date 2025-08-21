package com.seenu.Scenario;
class X{
    static void show(){
        System.out.println("Class-X");
    }
}
class Y extends X {
    static void show() {
        System.out.println("Class-Y");
    }
}

public class ABC {
    public static void main(String[] args) {
        X x = new Y();
        Y y = new Y();
        x.show();
        y.show();
    }
}

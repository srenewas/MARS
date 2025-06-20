package com.seenu.naya;

public class superKeyword {
    int i=100;
    int j=200;
}
class A extends superKeyword{
    int i=10;
    int j=20;
    A(int i, int j){
        System.out.println(i+"-"+j);
        System.out.println(this.i+"-"+this.j);
        System.out.println(super.i+"-"+super.j);
    }
}
class demo{
    public static void main(String[] args) {

        A a = new A(20,20);
    }
}

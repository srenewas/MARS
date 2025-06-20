package com.seenu.naya;

public interface interfaces {
    default void display(){
        System.out.println("inside_interface");
    }
}
class AAA implements interfaces{
    public void display(){
        System.out.println("Inside_AAA");
    }
}
class BBB implements interfaces{
    public void display(){
        System.out.println("Inside_BBB");
    }
}
class CCC implements interfaces{
    public void display(){
        System.out.println("Inside_CCC");
    }
}
class DDD implements interfaces{
    public void display(){
        System.out.println("Inside_DDD");
    }
}
class test12{
    public static void main(String[] args) {
        AAA a = new AAA();
        a.display();

        BBB aa = new BBB();
        aa.display();

        CCC cc = new CCC();
        cc.display();

    }
}

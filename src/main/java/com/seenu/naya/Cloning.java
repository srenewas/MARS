package com.seenu.naya;

public class Cloning implements Cloneable{
    String name;

    public Cloning(String name) {
        this.name = name;
    }

    public Cloning clone() throws CloneNotSupportedException {
        return (Cloning) super.clone();
    }

    @Override
    public String toString() {
        return "cloning{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Cloning cl1 = new Cloning("seenu");
        Cloning cl2 = cl1.clone();
        System.out.println("Original Object :"+cl1);
        System.out.println("Cloning Object :"+cl2);
        System.out.println(cl1.equals(cl2));
    }
}

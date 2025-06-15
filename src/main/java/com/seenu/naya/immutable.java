package com.seenu.naya;

public final class immutable {
    private final String name;
    private final int age;

    public immutable(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Only getters, no setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        immutable im = new immutable("Sree",101);
        System.out.println(im.getName());
        System.out.println(im.getAge());
        //im.name = "NEW"; //Make Class not Final§
        //im.age = 101;    //Make Class not Final
    }
}

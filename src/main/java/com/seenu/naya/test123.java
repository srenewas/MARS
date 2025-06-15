package com.seenu.naya;

final class test123 {
    final String name;
    final int age;

    private test123(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        test123 test = new test123("seenu",101);
        System.out.println(test.getName());
       //test.name="seenu";
    }

}

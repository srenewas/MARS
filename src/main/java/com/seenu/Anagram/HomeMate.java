package com.seenu.Anagram;

import com.seenu.map.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class HomeMate {
    private String name;
    private int age;
    private Double salary;

    public HomeMate(String name, int age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Sujjamma{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        List<HomeMate> list = new ArrayList<>();
        list.add(new HomeMate("Sujju",25,65000.0));
        list.add(new HomeMate("Seenu",30,265000.0));
        list.add(new HomeMate("Buddodu",1,5000.0));
        list.add(new HomeMate("Seenu",20,65000.0));

        list.stream().forEach(System.out::println);
        System.out.println("--------------------------------");
        list.stream().peek(p->p.setName(p.getName().toUpperCase())).forEach(System.out::println);
        System.out.println("--------------------------------");
        list.stream().peek(p->p.setSalary(p.getSalary()+5000)).forEach(System.out::println);
        System.out.println("--------------------------------");
        list.stream().map(m->m.getName()).forEach(System.out::println);
        System.out.println("--------------------------------");


    }
}

package com.seenu.map;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Student {
    int id;
    String name;
    String department;
    Double salary;

    public Student(int id, String name, String department, Double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    /*public static boolean isprime(int n){
        if(n<=1) return false;
        if(n%2==0) return false;
        if (n==2) return true;

        for (int i=3;i<=Math.sqrt(n);i+=2){
            if (n%i==0) return false;
        }
        return true;
    }*/
    private static boolean isPrime(int number){
        if (number<=0) return false;
        return IntStream.rangeClosed(2,(int)Math.sqrt(number)).allMatch(n->number%n!=0);
    }

    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();
        student.add(new Student(23,"Seenu","Java",95000.0));
        student.add(new Student(2,"Sujju","Linux",75000.0));
        student.add(new Student(22,"Buddu","Java",85000.0));
        student.add(new Student(7,"Dany","Devops",65000.0));
        student.add(new Student(13,"Rexy","Linux",25000.0));
        student.add(new Student(106,"Mummy","Java",15000.0));

        student.stream().forEach(System.out::println);
        System.out.println("\n------------------------------------");
        List<Student> stu = student.stream()
                .filter(f->f.getSalary()>65000)
                .sorted(Comparator.comparing(Student::getSalary).reversed())
                .collect(Collectors.toList());
        System.out.println(stu);

        System.out.println("\n------------------------------------");

        student.stream()
                .collect(Collectors.toMap(
                        Student::getId,     //Key
                        students->students,  // Value
                        (ext,replace)->ext,   // Merge Functions
                        LinkedHashMap::new  // Optional (If need Insertion Order)
                )).forEach((k,v)->System.out.println(k+"==>"+v));

        System.out.println("\n------------------------------------");

        student.stream()
                .collect(Collectors.toMap(
                        Student::getName,
                        st->st,
                        (k,v)->k,
                        LinkedHashMap::new
                )).forEach((k,v)->System.out.println(k+"-->"+v));

        System.out.println("\n------------------Prime_Numbers------------------");
        /*student.stream()
                .filter(f->isprime(f.getId()))
                .forEach(System.out::println);*/

        System.out.println("\n------------------Prime_Numbers------------------");
        student.stream()
                .filter(f->isPrime(f.getId()))
                .forEach(System.out::println);
    }
}
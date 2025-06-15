package com.seenu.comparator;

public class Employee {
    String name;
    double Salary;

    Employee(Double salary, String name) {
        this.Salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Salary='" + Salary + '\'' +
                '}';
    }
}
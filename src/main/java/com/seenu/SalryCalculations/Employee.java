package com.seenu.SalryCalculations;

class Employee {
    private int id;
    private String name;
    private int age;
    private double daySal;
    private double totalSalary;
    private String month;
    private int noOfWorkingDays;

    public Employee(int id, String name, int age, double daySal, double totalSalary, String month, int noOfWorkingDays) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.daySal = daySal;
        this.totalSalary = totalSalary;
        this.month = month;
        this.noOfWorkingDays = noOfWorkingDays;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getDaySal() {
        return daySal;
    }

    public void setDaySal(double daySal) {
        this.daySal = daySal;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getNoOfWorkingDays() {
        return noOfWorkingDays;
    }

    public void setNoOfWorkingDays(int noOfWorkingDays) {
        this.noOfWorkingDays = noOfWorkingDays;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", daySal=" + daySal +
                ", totalSalary=" + totalSalary +
                ", month='" + month + '\'' +
                ", noOfWorkingDays=" + noOfWorkingDays +
                '}';
    }
}
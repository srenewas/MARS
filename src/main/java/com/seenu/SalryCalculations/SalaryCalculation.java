package com.seenu.SalryCalculations;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;

public class SalaryCalculation implements Callable<Employee> {
    private final Employee emp;

    public SalaryCalculation(Employee emp) {
        this.emp = emp;
    }

    @Override
    public Employee call() throws InterruptedException {
        double salary = emp.getDaySal() * emp.getNoOfWorkingDays();
        Thread.sleep(1000); // simulate delay
        emp.setTotalSalary(salary);
        return emp;
    }

    public static void main(String[] args) throws InterruptedException {
        List<Employee> employees = List.of(
                new Employee(100, "Mercury", 25, 200.0, 0.0, "JAN", 25),
                new Employee(101, "Venus", 24, 200.0, 0.0, "JAN", 22),
                new Employee(102, "Earth", 45, 200.0, 0.0, "JAN", 25),
                new Employee(103, "Jupiter", 15, 200.0, 0.0, "JAN", 20),
                new Employee(104, "Mars", 75, 200.0, 0.0, "JAN", 19),
                new Employee(105, "Uranus", 45, 200.0, 0.0, "JAN", 20),
                new Employee(106, "Neptune", 20, 200.0, 0.0, "JAN", 24),
                new Employee(107, "Pluto", 19, 200.0, 0.0, "JAN", 25)
        );

        System.out.println("Original Employees:");
        employees.forEach(System.out::println);

        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Future<Employee>> futures = executor.invokeAll(
                employees.stream().map(SalaryCalculation::new).toList()
        );

        List<Employee> updatedEmployees = futures.stream()
                .map(future -> {
                    try {
                        return future.get();
                    } catch (Exception e) {
                        System.out.println("Error calculating salary: " + e.getMessage());
                        return null;
                    }
                })
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

        System.out.println("\nUpdated Employees:");
        updatedEmployees.forEach(System.out::println);

        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.SECONDS);
    }
}

package com.seenu.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class test {
    public static void main(String[] args) {
        Map<String, Employee> map = new HashMap<>();
        map.put("Emp1",new Employee(101,"srinivas",65000.00,"Java"));
        map.put("Emp2",new Employee(102,"sujatha",75000.00,"Automation"));
        map.put("Emp3",new Employee(103,"buddodu",89000.00,"Java"));
        map.put("Emp4",new Employee(104,"sujju",6000.00,"Linux"));
        map.put("Emp5",new Employee(105,"Danny",65000.00,"Devops"));

        System.out.println("*********Values*********");
        map.entrySet().stream().map(s->s.getValue()).forEach(System.out::println);

        System.out.println("\n*********Keys*********");
        map.entrySet().stream().map(s->s.getKey()).forEach(System.out::println);

        System.out.println("\n*********Fetching_Names_from_Map_Values*********");
        map.values().stream().map(s->s.getName()).forEach(System.out::println);

        System.out.println("\n*********Salary_Based_On_Filter*********");
        map.values().stream().filter(s->s.getSalary() > 80000).map(s->s.getSalary()).forEach(System.out::println);
        map.entrySet().stream().map(e->e.getValue()).filter(e->e.getSalary()>70000).forEach(System.out::println);

        System.out.println("\n*********Filter_Based_On_Name*********");
        map.values().stream().filter(s->Objects.nonNull(s.getName())).forEach(System.out::println);
        //map.values().stream().map(s->s.getName().toUpperCase()).forEach(System.out::println);
        map.values().stream().peek(s-> s.setName(s.getName().toUpperCase())).forEach(System.out::println);
        map.values().stream().filter(s->s.getName().startsWith("s")).forEach(System.out::println);
       // map.values().stream().filter(s->s.getName()==null).forEach(s->System.out.println(s.toString()));
        /*map.values().stream().map(s->{s.setName(s.getName().toUpperCase());
            return s;
        }).forEach(System.out::println);*/

        System.out.println("\n*********Find_Highest_Salary_From_Employee_Object*********");
        map.values().stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(e ->System.out.println(e.toString()));

        System.out.println("\n*********Find_Lowest_Salary_From_Employee_Object*********");
        map.values().stream().min(Comparator.comparing(Employee::getSalary)).ifPresent(e->System.out.println(e.toString()));

        System.out.println("\n*********Filter_Based_On_Department*********");
        map.values().stream().filter(e->e.getDepartment().contains("Java")).forEach(System.out::println);

        System.out.println("\n*********Sorting_Based_On_Department*********");
        map.values().stream().sorted(Comparator.comparing(Employee::getDepartment)).forEach(System.out::println);

        System.out.println("\n*********Compute the Employee Object*********");

        map.computeIfPresent("Emp4",(key,emp)-> {emp.setSalary(emp.getSalary()+1250);return emp;});
        map.compute("Emp1",(key, emp)->{
            if(emp!=null){
                emp.setDepartment("FullStack");
                emp.setSalary(emp.getSalary()+2000);
            }
            return emp;
        });

        map.computeIfAbsent("Emp6",key-> new Employee(106,"Suhas",60000.0,"Minitor"));

        map.forEach((key,value)->System.out.println(key+" ==> "+value));


        /*Set<String> set = map.keySet();
        //System.out.println(set);                // Only sop
        set.forEach(s-> System.out.println(s)); // Using Lambda expression
        set.forEach(System.out::println);       // Using method reference

        Collection<Employee> cl = map.values();
        //System.out.println(cl);
        cl.forEach(System.out::println);
        cl.forEach(s->System.out.println(s));

        Set<Map.Entry<String, Employee>> ss = map.entrySet();
        System.out.println(ss);
        for(Map.Entry<String,Employee> entry : ss){
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }

        for(Employee emp : map.values()){
            if("SU".equals(emp.getName())){
                System.out.println(emp);
            }
        }*/

    }
}

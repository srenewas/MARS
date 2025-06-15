package com.seenu.collection.map;

import java.util.HashMap;
import java.util.Map.Entry;

public class test {
	public static void main(String[] args) {
		HashMap<Employee,Student> map = new HashMap<>();
		map.put(new Employee(101, "seenu", 650000.00), new Student(1, "suhas"));
		map.put(new Employee(112, "mini", 650000.00), new Student(1, "aron"));
		map.put(new Employee(110, "sujju", 650000.00), new Student(1, "bugga"));
		map.put(new Employee(222, "mammu", 650000.00), new Student(1, "suvva"));

		/*Set<Employee> set = map.keySet();
		set.forEach(System.out::println);

		Collection<Student> cl = map.values();
		cl.forEach(System.out::println);

		Set<Entry<Employee,Student>> ss = map.entrySet();
		ss.forEach(s->System.out.println());
		ss.forEach(System.out::println);*/

		for(Employee emp :map.keySet()) {
			System.out.println(emp.eid+" "+ emp.name);                         //THIS WILL PRINT KEYS OF ELEMENTS ONLY
		}
		
		for(Student s:map.values()) {
			System.out.println(s.sid+" "+s.name);                              //THIS WILL PRINT VALUES OF ELEMENTS ONLY
		}
		
		for(Entry<Employee, Student> entry :map.entrySet()) {
			System.out.println(entry.getKey()+"        "+ entry.getValue());   //THIS WILL PRINT ALL KEY AND VALUES
		}
	}
}

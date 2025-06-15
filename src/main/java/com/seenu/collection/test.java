package com.seenu.collection;

import java.util.ArrayList;
import java.util.Collections;

public class test {
	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee("seenu", 101));
		emp.add(new Employee("akhil", 102));
		emp.add(new Employee("suhas", 105));
		Collections.sort(emp);
		for(Employee e :emp) {
			System.out.println(e.id+" "+e.name);
		}
	}

}

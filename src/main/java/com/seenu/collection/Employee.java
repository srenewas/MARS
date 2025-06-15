package com.seenu.collection;

class Employee implements Comparable<Employee>{
	String name;
	int id;
	public Employee(String name,int id) {
		super();
		this.name= name;
		this.id = id;
	}
@Override
public int compareTo(Employee e1) {
	Employee em = (Employee)e1;
	if(id==em.id)
		return 0;
	else if(id>em.id)
		return +1;
	else
		return -1;
}
}



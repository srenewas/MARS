package com.seenu.collection.map;

public class Employee {
	int eid;
	String name;
	public Employee(int eid, String name, double v) {
		super();
		this.eid = eid;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + "]";
	}

}

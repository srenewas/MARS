package com.seenu.oldcode;

class Animal{
	public void move() {
		System.out.println("Animal method........");
	}
	public void Dummy() {
		System.out.println("Dummy Method........");
	}
}
class Dog extends Animal{
	public void move() {
		System.out.println("Dog method.......");
	}
}
public class Method_Overriding {
	public static void main(String[] args) {
		Animal a = new Animal();
		Animal b = new Dog();
		a.move();
		b.move();
	}
}

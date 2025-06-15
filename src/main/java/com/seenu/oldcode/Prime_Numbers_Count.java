package com.seenu.oldcode;

import java.util.Scanner;

public class Prime_Numbers_Count {
	public static void main(String[]args) {
		int temp,num;
		boolean isprime = true;
		System.out.println("Enter the Prime Value...");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		for(int i=2;i<=num/2;i++) {
			temp =num%i;
			if(temp==0) {
				isprime=false;
			}
		}
		if(isprime) {
			System.out.println(isprime+"--->"+"This Is The PrimeNumber");
		}else {
			System.out.println(isprime+"-->"+"Sorry Invalid");
		}
	}
}

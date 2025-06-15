package com.seenu.oldcode;

public class Array_Min_Max {
	public static void main(String[] args) {
		int [] a = {5,8,1,9,20};
		int max = 0;
		int min = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max = a[i];
			}else if(a[i]<min) {
				min = a[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}

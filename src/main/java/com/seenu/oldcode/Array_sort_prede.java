package com.seenu.oldcode;

public class Array_sort_prede {
	public static void main(String[] args) {
		int[] a = {1,4,2,6,9,5};
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i=0 ; i<a.length;i++) {
			System.out.println(a[i]);
			}
       }
  }
package com.seenu.oldcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays_to_collection {
	public static void test(){
		String[] s = {"seenu","sujju"};
		ArrayList al = new ArrayList(Arrays.asList(s));
		//System.out.println(al);
		for (String ss : s){
			System.out.println(ss);
		}
	}
	public static void main(String[] args) {
		test();
		int[] i = {1,4,2,7,4,9,10};
		ArrayList al = new ArrayList(Arrays.asList(i));
		for(int j : i) {
			System.out.println(j);
		}
	}
}

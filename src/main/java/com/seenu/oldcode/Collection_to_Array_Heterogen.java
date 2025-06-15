package com.seenu.oldcode;

import java.util.ArrayList;

public class Collection_to_Array_Heterogen {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("seenu");
		al.add(12);
		al.add(null);
		
		//HERE WE COVERT THE COLLECTION DATA INTO ARRAYS DATA 
		
		Object [] o = al.toArray();
		for(Object oo :o) {
			System.out.println(oo);
		}
	}

}

package com.seenu.oldcode;

public class String_SubString {
	public static void main(String[] args) {
		String s = "i luv my india";             // Strarts from 0th index
		System.out.println(s.length());         // Length is 14
		System.out.println(s.substring(2,5));   // 2nd letter include
		System.out.println(s.substring(9));       // india
		System.out.println(s.substring(2,5)+" "+s.substring(9));    // luv india
	}
}

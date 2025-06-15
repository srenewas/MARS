package com.seenu.oldcode;

public class Reverce_String {
	public static void main(String[] args) {
		String s = "seenu iglesias";
		char[] ch = s.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.println(ch[i]);
		}
	}

}

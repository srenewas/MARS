package com.seenu.oldcode;

public class Letters_Check2 {
	public static void main(String[] args) {
		String s ="seenu iglesias";
		char[] ch = s.toCharArray();
		int count = 0;
		for(char c :ch) {
			switch(c) {
			case 'e':
				count++;
				break;
			}
		}
		System.out.println(count);
	}
}

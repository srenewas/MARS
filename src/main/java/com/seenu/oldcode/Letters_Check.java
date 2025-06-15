package com.seenu.oldcode;

public class Letters_Check {
	public static void main(String[] args) {
		String s = "SEENU IGLESIAS";
		char tocheck = 'E';
		int count = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==tocheck) {
				count++;
			}
		}
		System.out.println(count);
	}
}


/*
✅ What It Does:
Loops through each character in the string s.
Checks if the character matches 'N'.
Increments a counter if it does.
Prints the final count.*/

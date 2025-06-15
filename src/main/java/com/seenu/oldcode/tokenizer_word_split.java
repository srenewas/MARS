package com.seenu.oldcode;

import java.util.StringTokenizer;

public class tokenizer_word_split {
	public static void main(String[] args) {
		StringTokenizer s = new StringTokenizer("seenu miquel iglesias preysler");
		System.out.println(s.countTokens());
		while (s.hasMoreTokens()) {
			System.out.println(s.nextToken());
		}
	}
	

}

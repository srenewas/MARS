package com.seenu.oldcode;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap_Sort {
	public static void main(String[] args) {
		TreeMap<String,String> tm = new TreeMap<>();
		tm.put("B","Banana");
		tm.put("C","Cherry");
		tm.put("A","Apple");
		System.out.println(tm);

	}
}
class MyComp implements Comparator <String>{
	@Override
	public int compare(String i1, String i2) {
		return i1.compareTo(i2);
	}

}

/*class MyComp implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2);
	}
	
}*/

package com.seenu.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(101, "seenu");
		map.put(102, "suhas");
		map.put(110, "minion");
		map.put(123, "akhil");
		
		System.out.println(map);            //THIS WILL PRINT THE LOG MSG ONLY
		
		Set<Integer> s = map.keySet();
		System.out.println(s);              //THIS WILL PRINT KEY OF ELEMENTS ONLY
		
		Collection<String> ss = map.values();
		System.out.println(ss);             //THIS WILL PRINT VALUES OF ELEMENTS ONLY
		
		Set<Entry<Integer, String>> sss = map.entrySet();
		for(Entry<Integer, String> s3 :sss) {
			System.out.println(s3);         //THIS WILL PRINT ALL KEY AND VALUES
		}
	}
}

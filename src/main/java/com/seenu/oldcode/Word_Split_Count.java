package com.seenu.oldcode;

import java.util.HashMap;
import java.util.Map;

public class Word_Split_Count {
	public static void main(String[] args) {
		String s = "I I i am am am Iron Man Man";
		String [] str  = s.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0;i<str.length;i++) {
			if(map.containsKey(str[i])) {
				int count = map.get(str[i]);
				map.put(str[i], count+1);
			}else {
				map.put(str[i], 1);
			}
		}
		System.out.println(map);     // Output :- {I=1, i=1, Iron=1, Man=1, am=3}
 
	}

}

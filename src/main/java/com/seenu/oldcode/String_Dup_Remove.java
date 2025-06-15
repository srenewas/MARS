package com.seenu.oldcode;

import java.util.HashSet;
import java.util.Set;

public class String_Dup_Remove {
	public static void main(String[] args) {
		
		String s= "abbccccdef";
		Set<Character> set = new HashSet<>();   // HERE WE TAKE SET Y BECAUSE ONLY SET DOESN'T ALLOW DUPLICATES
		StringBuffer sf = new StringBuffer();   // FOR OUTPUT

		/* //Using Stream
		int[] a ={5,8,1,3,9,3};
		Set<Integer> set = Arrays.stream(a)  // IntStream
                         .boxed()    // Convert int to Integer
                         .collect(Collectors.toSet());
		System.out.println(set);
		// normal way
		Set set1 = new HashSet();
		for(int aa: a){
			set1.add(aa);
		}
		System.out.println(set1);*/

		for(int i=0;i<s.length();i++) {
			Character ch = s.charAt(i);        // CONVERT STRING INTO CHARACTER
			if(!set.contains(ch)) {
				set.add(ch);                   // OUTPUT ADD TO SET  LIKE-------> [a, b, c, d, e, f]
				sf.append(ch);                 // FOR PROPER OUTPUT  LIKE-------> abcdef
			}
		}
		System.out.println(set.toString());    // OUTPUT-----> [a, b, c, d, e, f]
		System.out.println(sf.toString());     // OUTPUT-----> abcdef
	}

}

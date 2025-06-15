package com.seenu.oldcode;

public class String_Dup_Retrieve {
	public static void main(String[]args) {

		/*int[] a ={5,8,1,3,9,3};
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		for (int num : a){
			if(!set1.add(num)){
				set2.add(num);
			}
		}
		System.out.println(set2);*/

		String s = "seenuu";
		char[] ch =s.toCharArray();
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(ch[i]==ch[j]) {
					System.out.println(ch[j]);
					break;
				}
			}
		}
	}
}

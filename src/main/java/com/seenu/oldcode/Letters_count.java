package com.seenu.oldcode;

public class Letters_count {
	public static void main(String[] args) {
		String s = "seenu iglesias";
		int count = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ')
				count++;
		}
		System.out.println(count);

		String s1 = "Seenusss";
        char[] ch = s1.toCharArray();
        int count1 =0;
        for (int i=0;i<ch.length;i++){
            if(ch.length!=' ')
                count1++;
        }
		System.out.println(count1);
	}
}

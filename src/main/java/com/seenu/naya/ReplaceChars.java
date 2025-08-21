package com.seenu.naya;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReplaceChars {
    public static void main(String[] args) {
        String s = "chende srinivas";
        //Output : chinde srinivas

        // Using Streams
        String out = IntStream.range(0,s.length())
                .mapToObj(i->{
                    char ch = s.charAt(i);
                    if (i==2 && ch=='e') return "i";
                    if (i==9 && ch=='i') return "e";
                    return String.valueOf(ch);
                }).collect(Collectors.joining());
        System.out.println(out);

        //Plain Java
        char[] ch = s.toCharArray();
        if (ch[2]=='e') ch[2] = 'i';
        if (ch[9]=='i') ch[9] = 'e';
        String result = new String(ch);
        System.out.println(result);
    }
}

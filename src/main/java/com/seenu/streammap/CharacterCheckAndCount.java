package com.seenu.streammap;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCheckAndCount {
    public static void main(String[] args) {
        String s = "baaccad";
        Map<String, Long> map =  s.chars()
                .mapToObj(m->String.valueOf((char)m))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);

        String tostring = map.toString();
        String result = tostring.replaceAll("[=, {}]","");
        System.out.println(result);
    }
}

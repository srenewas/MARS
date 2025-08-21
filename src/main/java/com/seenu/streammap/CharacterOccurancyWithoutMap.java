package com.seenu.streammap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccurancyWithoutMap {
    public static void main(String[] args) {
        String input = "bbrrffll";
        //b2r2f2l2
        Map<String, Long> result = input.chars()
                .mapToObj(m -> String.valueOf((char) m))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        for (String re : result.keySet()) {
            System.out.print(re + result.get(re));
        }
    }
}

package com.seenu.Scenario;

import java.util.*;

public class Scenario1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Map<String,Integer> map = new HashMap<>();
        for (int i=0;i<3;i++){
            list.add(null);     // {null,null, null}
            set.add(null);      // {null}
            map.put(null,null); // {null,null}
        }
        System.out.println(list+"\n"+set+"\n"+map);
    }
}

package com.seenu.LinkedList;

import java.util.LinkedList;

public class MiddleOfLinkedListUsingCollections {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(11);
        list.add(20);
        list.add(35);
        list.add(41);
        list.add(52);
        list.add(60);
        list.add(72);

        int listSize = list.size();
        System.out.println(listSize);
        int middleList = listSize/2;

        int result = list.get(middleList);
        System.out.println(result);

    }
}

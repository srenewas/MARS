package com.seenu.oldcode;

import java.util.HashSet;
import java.util.Set;

public class sort_collection_stream {
    public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("seenu");
		set.add("aeron");
		set.add("seenu");
		set.add("bugga");
		set.add("suvva");
		set.stream().sorted().forEach(System.out::println);
	}
}

/*
set.stream().sorted().forEach(System.out::println);
This line uses Java Stream API to:
 1:Convert the Set to a stream: set.stream()
 2:Sort the elements alphabetically: .sorted()
 3:Print each element: .forEach(System.out::println)*/

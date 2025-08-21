package com.seenu.streammap;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPartitionning {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 5, 7, 8, 9);
        Map<Boolean,List<Integer>> partition = list.stream().collect(Collectors.partitioningBy(n->n%2==0));
        System.out.println("Even :"+partition.get(true));
        System.out.println("Odd :"+partition.get(false));
    }
}
/*Even :[2, 8]
  Odd :[5, 7, 9]
 */

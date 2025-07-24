package com.seenu.DSA;

import java.util.stream.IntStream;

public class SearchinRotatedSortedArray {
    public static void main(String[] args) {
        int[] num = {4,5,6,7,0,1,2};   // Here input is element Array
        int target =2;  // Here target is index of element
        int result = IntStream.range(0,num.length)
                .filter(f->num[f]==target)
                .findFirst()
                .orElse(-1);
        System.out.println(result);
    }
}

/*
| Input                                | Target | Output |
        | ---------------------------- | ------ | ------ |
        | \[4,5,6,7,0,1,2]             | 0      | 4      |
        | \[4,5,6,7,0,1,2]             | 3      | -1     |
        | \[1]                         | 0      | -1     |
        | \[1,3]                       | 3      | 1      |
        | \[3,1]                       | 1      | 1      |
        | \[5,6,7,0,1,2,4], target = 2 | 2      | 5      |
*/


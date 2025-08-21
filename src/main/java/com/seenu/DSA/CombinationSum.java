package com.seenu.DSA;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CombinationSum {

    public static void backtrack(int[] candidates, int target, int start, List<Integer> combination, List<List<Integer>> result){
        if (target==0) {
            result.add(new ArrayList<>(combination));
            return;
        }
        if (target<0) return;
        for (int i=start; i<candidates.length;i++){
            combination.add(candidates[i]);
            backtrack(candidates,target-candidates[i],i,combination,result);
            combination.remove(combination.size()-1);
        }
    }

    public static void main(String[] args) {
            int[] candidates = {3, 6, 7,2};
            int target = 7;
            List<List<Integer>> result = new ArrayList<>();
            backtrack(candidates,target,0, new ArrayList<>(),result);

            result.stream()
                    .forEach(System.out::println);

        }
    }

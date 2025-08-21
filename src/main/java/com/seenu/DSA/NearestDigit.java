package com.seenu.DSA;

public class NearestDigit {
    public static void main(String[] args) {
        int [] input = {5,7,12,18,26,33,100};
        int target = 19;
        int difference = Math.abs(target-input[0]);
        int element = input[0];
        for (int i=1;i<input.length;i++){
            int currentdifference = Math.abs(target-input[i]);
            if (currentdifference<difference){
                difference=currentdifference;
                element=input[i];
            }
        }
        System.out.println(element);


        // Simplified way
        int [] input2 = {5,7,12,18,26,33,100};
        int target2 = 19;
        int nearest = input2[0];  // Assume initial nearest element 0th index
        for (int num : input2){
            if (Math.abs(target2-num) < Math.abs(target2-nearest)){
                nearest= num;
            }
        }
        System.out.println(nearest);
    }
}

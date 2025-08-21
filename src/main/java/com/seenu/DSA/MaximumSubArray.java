package com.seenu.DSA;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] num = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int currMax = num[0];
        int max = num[0];
        for (int i=0;i<num.length;i++){
            currMax = Math.max(num[i],currMax+num[i]);
            max = Math.max(max,currMax);
        }
        System.out.println("Maximum_Sub_Array is: "+max);
    }
}

/*🧮 Iteration-wise Breakdown:
        ✅ Step 0: i = 0
        currMax = -2
        maxSoFar = -2

        ✅ Step 1: i = 1, arr[1] = 1
        currMax = Math.max(arr[1], currMax + arr[1])
        = Math.max(1, -2 + 1)
        = Math.max(1, -1)
        = 1      ✅
        maxSoFar = Math.max(maxSoFar, currMax)
         = Math.max(-2, 1)
         = 1
         */

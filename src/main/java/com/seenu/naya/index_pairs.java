package com.seenu.naya;
/*trying to find index pairs in the array nums where the sum of the two elements equals the target (which is 8).
The output shows index pairs like [1, 4] where nums[1] + nums[4] == 8.*/
public class index_pairs {
    public static void main(String[] args) {
        int [] nums = {2, 4, 7, 9, 4, 1, 6, 0};
        int target =8;
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
/*
🔁 HOW THE LOOP WORKS:
You are using two nested loops:
The outer loop picks the first number (nums[i])
The inner loop picks the second number (nums[j]), only after i to avoid duplicates

✅ EXAMPLE: i = 0
nums[0] = 2
Now loop through j = 1 to 7 and check:
j	nums[j]	nums[0] + nums[j]	Is it 8?	Result
1	4	2 + 4 = 6	❌	No output
2	7	2 + 7 = 9	❌	No output
3	9	2 + 9 = 11	❌	No output
4	4	2 + 4 = 6	❌	No output
5	1	2 + 1 = 3	❌	No output
6	6	2 + 6 = 8	✅	Output: 0 6
        7	0	2 + 0 = 2	❌	No output

✅ NEXT: i = 1
nums[1] = 4
Now check from j = 2 to 7:
j	nums[j]	nums[1] + nums[j]	Is it 8?	Result
2	7	4 + 7 = 11	❌	No output
3	9	4 + 9 = 13	❌	No output
4	4	4 + 4 = 8	✅	Output: 1 4
        5	1	4 + 1 = 5	❌	No output
6	6	4 + 6 = 10	❌	No output
7	0	4 + 0 = 4	❌	No output

 ✅ i = 2
nums[2] = 7
Now loop j from 3 to 7 and check nums[2] + nums[j] == 8

j	nums[j]	nums[2] + nums[j]	Is it 8?	Result
3	9	7 + 9 = 16	❌	No output
4	4	7 + 4 = 11	❌	No output
5	1	7 + 1 = 8	✅	Output: 2 5
        6	6	7 + 6 = 13	❌	No output
7	0	7 + 0 = 7	❌	No output

✅ Output So Far:
        0 6 → nums[0] + nums[6] = 2 + 6 = 8
        1 4 → nums[1] + nums[4] = 4 + 4 = 8
        2 5 → nums[2] + nums[5] = 7 + 1 = 8

*/

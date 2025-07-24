package com.seenu.DSA;


public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height){     // This method takes an array of integers representing heights of vertical lines.
        int max=0, left=0, right=height.length-1;
        while (left<right){
            int h = Math.min(height[left],height[right]);  //This line finds the height of the water container formed between the two lines at index left and right.
            int w = right-left;
            max = Math.max(max,h*w);

            if (height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}

/*
Input: height = [1,8,6,2,5,4,8,3,7]

       |
     8 |   █                       █
     7 |   █                       █ █
     6 |   █     █                 █ █
     5 |   █     █     █           █ █
     4 |   █     █     █     █     █ █
     3 |   █     █     █     █     █ █
     2 |   █     █ █   █     █     █ █
     1 | █ █     █ █   █     █ █   █ █
     0 |--------------------------------
         0 1     2 3   4     5 6   7 8

Max area = 49 (between index 1 and 8 → min(8, 7) * (8 - 1) = 7 * 7 = 49)
*/


/*
🧠 Time & Space Complexity:
Time: O(n) (one pass using two pointers)
Space: O(1)
*/

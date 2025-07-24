package com.seenu.DSA;

import java.util.Arrays;

public class RotateMatrix {
    public static void rotateMatrix(int[][] matrix){
        int n = matrix.length;
        //transpose the matrix
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        /*
        Before transpose:
        1 2 3
        4 5 6
        7 8 9

        After transpose:
        1 4 7
        2 5 8
        3 6 9
        */

        //reverse the matrix
        for (int[] row : matrix){
            for (int i = 0, j = row.length - 1; i < j ; i++ , j--){
                int temp = row[i];
                row[i] = row[j];
                row[j] = temp;
            }
        }

   /*   1 4 7  → 7 4 1
        2 5 8  → 8 5 2
        3 6 9  → 9 6 3
  */
    }
    public static void main(String[] args) {
        int[][] matrix ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        rotateMatrix(matrix);
        for (int[] row : matrix){
            System.out.println(Arrays.toString(row));
        }
    }
}

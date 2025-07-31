package com.seenu.oldcode;

import org.bson.codecs.pojo.annotations.BsonId;

public class StarPyramid {
    public static void main(String[] args) {
        int rows =5; // height of the pyramid
        for (int i=1;i<=rows;i++){  // int i=rows;i>=1;i--
            int spaces = rows-i;
            int stars = 2*i-1;
            for (int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            for (int k=0;k<stars;k++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}

package com.seenu.naya;

public class thisKeywords {
    int i=10;
    int j=20;
    thisKeywords(int i, int j){
        System.out.println(i+"--"+j);
        System.out.println(this.i+"--"+this.j);
    }
}
    class test{
    public static void main(String[] args) {
        thisKeywords ts = new thisKeywords(30,40);
    }
}

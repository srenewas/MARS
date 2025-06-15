package com.seenu.streammap;

public class CharCount {
    public static void main(String[] args) {
        String s = "seenuuuuu";
        long count = s.chars().filter(c->c=='u').count();
        System.out.println(count);
    }
}

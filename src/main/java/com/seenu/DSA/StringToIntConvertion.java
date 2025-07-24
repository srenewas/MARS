package com.seenu.DSA;

import java.math.BigInteger;

public class StringToIntConvertion {
    public static void main(String[] args) {
        String s = "456789";
        int output1 = Integer.parseInt(s);
        System.out.println(output1);

        int output2 = Integer.valueOf(s);
        System.out.println(output2);

        int output3 = Math.toIntExact(Long.parseLong(s));
        System.out.println(output3);

        BigInteger bi = new BigInteger(s);
        System.out.println(bi);
    }
}

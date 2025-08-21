package com.seenu.PrimeNumbers;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean isPrime;
        while (true){
            System.out.print("Enter Number: ");
            int num = scanner.nextInt();
            if (num<=1){
                isPrime=false;
            }else {
                isPrime= IntStream.rangeClosed(2,(int)Math.sqrt(num)).noneMatch(n->num%n==0);
            }
            System.out.println("Is the PrimeNumber: "+isPrime);
            //scanner.close();
        }

    }
}

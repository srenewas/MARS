package com.seenu.naya;

public class SumOfDigits {
    public static int sumDigit(int number){
        number= Math.abs(number);  // Handle -ve numbers
        int sum =0;
        while (number>0){
            sum += number%10;  // Get last number
            number/=10;       // Remove last digit
        }
        return sum;
    }
    public static void main(String[] args) {
        int input = 84729;
        int result = sumDigit(input);
        System.out.println("Output :"+result); //Output :30

        // Using Java Streams
        int streamResult = String.valueOf(input) //Convert to String -> "84729"
                .chars()                         // IntStream of char codes
                .map(c->c - '0')             // Convert char to digit
                .sum();                          // Sum all digit
        System.out.println(streamResult); // 30

    }
}

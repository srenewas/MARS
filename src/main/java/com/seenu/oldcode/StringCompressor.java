package com.seenu.oldcode;

public class StringCompressor {
    public static void main(String[] args) {
        String input = "aaabbcdd";
        StringBuilder result = new StringBuilder();

        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                result.append(input.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        // Append last character and its count
        result.append(input.charAt(input.length() - 1)).append(count);

        System.out.println(result.toString());
    }
}

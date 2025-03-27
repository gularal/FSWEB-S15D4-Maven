package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean checkForPalindrome(String text) {
        String cleanedText = text
                .replaceAll("[^\\p{L}'-]", "")
                .replaceAll("\\s+", "")
                .trim()
                .toLowerCase();

        String reversed = new StringBuilder(cleanedText).reverse().toString();

        return cleanedText.equals(reversed);
    }

    public static String convertDecimalToBinary(int decimalNumber) {
        String binary = "";
        int rest = decimalNumber;

        while (rest > 0) {
            int remainder = rest % 2;
            binary = remainder + binary;
            rest = rest / 2;
        }

        return binary;
    }
}
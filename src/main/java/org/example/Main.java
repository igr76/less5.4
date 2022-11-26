package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static boolean isPalindrome(String text) {
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - i - 1)) return false;
        }
        return true;
    }
    public static boolean checkPalindrome(String s) {
        String text = new StringBuilder(s).reverse().toString();
        return text.equals(s);
    }
}
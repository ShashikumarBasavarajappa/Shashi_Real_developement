package com.dev.collections;

public class Palindrome {
    public static boolean isPalindrome(String word) {

        int i =0;
        int j = word.length()-1;

        word = word.toUpperCase();

            do {
                if (word.charAt(i) != word.charAt(j)) {
                    return false;
                }
                i++;
                j--;

            } while (i < j);

        return true;
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}
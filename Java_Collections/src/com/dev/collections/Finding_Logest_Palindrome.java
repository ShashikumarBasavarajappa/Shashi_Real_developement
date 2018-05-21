package com.dev.collections;

import java.util.*;

public class Finding_Logest_Palindrome {

    public String longestPalindrome(String s) {
        char[] ch = s.toCharArray();

//        ArrayList<String> s1 =  new ArrayList<String>();
        List<char[]> cList = Arrays.asList(ch);
        System.out.println("_---------_");

        int max = 0;
        String longedSt_Palindrome = null;
        for (int i = 0; i < ch.length; i++) {

            int j = i + 2;

            while (j < ch.length) {

                if (ch[i] == ch[j]) {
                    System.out.println(ch[i] + " = " + ch[j]);
                    StringBuilder sbm = new StringBuilder();
                    String one_string = s.substring(i, j + 1);
                    sbm.append(one_string);
                    if (one_string.equals(sbm.reverse()) && one_string.length() > max) {
                        max = one_string.length();
                        longedSt_Palindrome = one_string;
                    }
                } else {
                    j = j + 2;
                }
            }
        }
        System.out.println("=======" + longedSt_Palindrome);
        return longedSt_Palindrome;
    }

    public static void main(String[] args) {
        Finding_Logest_Palindrome flp = new Finding_Logest_Palindrome();
        System.out.println(flp.longestPalindrome("babad"));
    }
}

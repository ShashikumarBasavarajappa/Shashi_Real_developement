package com.dev.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Substring_with_out_repeating {
    public int lengthOfLongestSubstring(String s) {

        char[]  str = s.toCharArray();
        for (int i=0;i<str.length;i++){



        }
        Set<String> s1 =  new HashSet<String>();

        int max = 0;
        for (int i=0;i<s.length();i++){
            s1.add(String.valueOf(str[i]));
            int num = 1;
            if(i == 0 ) {
                System.out.println("===== i : " + String.valueOf(str[i]));
            }
//shashikumarjakkalibasavarajappa
                for (int j = i+1; (j < str.length); j++) {

                    try {
                        if (str[i] != str[j] && !s1.contains(String.valueOf(str[j]))) {
                            if(i == 0 ){
                                System.out.println("===dasdsa== i : " + String.valueOf(str[j]));
                            }
                            //System.out.println(str[j]);
                            s1.add(String.valueOf(str[j]));
                            num++;
                        }else{

                            s1.clear();
                            break;
                        }
                    } catch (ArrayIndexOutOfBoundsException e){
                        e.printStackTrace();
                    }
                }
            if(i == 0 ){
                System.out.println("====asd= i : " + num);
            }
            //System.out.println(i+ " ====== " + num + "===" +  max);
           if(num >= max){
               max = num;
           }
        }
        return max;
    }

    public static void main(String[] args) {
        Substring_with_out_repeating ss =  new Substring_with_out_repeating();
        System.out.println("---" + ss.lengthOfLongestSubstring("c"));
    }
}

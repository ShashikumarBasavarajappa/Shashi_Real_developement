/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.interview;

/**
 *
 * @author Shashikumar J B <shashi2466@gmail.com>
 */
public class ReverseString_withoutAPI {

    public static void main(String[] args) {

        String s = "shashikumar";

        char[] ch = s.toCharArray();

        StringBuilder sb = new StringBuilder();
       
        
        for(int i=(ch.length -1);i>=0;i--){
            
            sb.append(ch[i]);
        }
        System.out.println("Reverse Strng : " + sb);
    }

}

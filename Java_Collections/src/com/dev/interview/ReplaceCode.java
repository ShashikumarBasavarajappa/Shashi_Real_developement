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
public class ReplaceCode {

    public String replace(String str, char ch) {
        System.out.println("String : " + str + " : " +  ch);
        //String result = str.replaceAll(ch, "_");
        str = str.replace(ch, 'd');
        
        System.out.println("String : " + str + " : " +  ch);
        return str;
    }

    public static void main(String[] args) {
        //public String replace(String str, char ch)
        new ReplaceCode().replace("shasddssssshi", 's');
    }

}

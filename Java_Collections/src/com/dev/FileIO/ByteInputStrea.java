/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dev.FileIO;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * 
 * @author Shashikumar J B <shashi2466@gmail.com>
 */
public class ByteInputStrea {

    public static void main(String[] args) {
        String  str =  new String("MY Name Is Shashikmar Jakkali");
        
        byte b[] = str.getBytes();
        
        try{
            ByteArrayInputStream batp = new ByteArrayInputStream(b);
            int c;
            while((c=batp.read()) != -1){
                System.out.print((char)c);
                batp.close();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

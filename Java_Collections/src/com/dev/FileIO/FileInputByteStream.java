/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dev.FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 
 * @author Shashikumar J B <shashi2466@gmail.com>
 */
public class FileInputByteStream {
    
    public static void main(String[] args) throws IOException {
        try{
            FileInputStream ff =  new FileInputStream("E:\\test.txt");
            int num =   ff.available();
            System.out.println("num : " + num);
            Byte b[] =  new Byte[num];

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        
    }

}

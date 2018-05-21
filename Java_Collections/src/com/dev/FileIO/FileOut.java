/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.FileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shashikumar J B <shashi2466@gmail.com>
 */
public class FileOut {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String str =  new String("Software Developer in Harman Connected Services");
        byte by[] = str.getBytes();
        
        try {
            FileOutputStream fop  = new FileOutputStream("E:\\test.txt");
            System.out.println("Done Dana Done");
            for(byte by1:by ){
                fop.write(by1);
            }
            fop.flush();
            fop.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileOut.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileOut.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        FileInputStream fff =  new FileInputStream("E:\\test.txt");
        int c;
        while((c=fff.read()) != -1){
            System.out.print((char)c);
        }
        
    }
}

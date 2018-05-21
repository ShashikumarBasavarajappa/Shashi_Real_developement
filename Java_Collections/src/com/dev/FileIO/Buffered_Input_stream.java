/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.FileIO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shashikumar J B <shashi2466@gmail.com>
 */
public class Buffered_Input_stream {

    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("E:\\test.txt");
        FileInputStream fop = new FileInputStream(f);

        BufferedInputStream bip = new BufferedInputStream(fop);

        int c;

        try {
            while ((c = bip.read()) != -1) {
                System.out.print((char) c);
            }
            bip.close();
            fop.close();

        } catch (IOException ex) {
            Logger.getLogger(Buffered_Input_stream.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

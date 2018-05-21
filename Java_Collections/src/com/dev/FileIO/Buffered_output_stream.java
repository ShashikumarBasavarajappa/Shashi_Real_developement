/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.FileIO;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Shashikumar J B <shashi2466@gmail.com>
 */
public class Buffered_output_stream {

    public static void main(String[] args) throws FileNotFoundException {
        String str = new String("Checking codeing");
        byte b[] = str.getBytes();

        try {
            FileOutputStream fop = new FileOutputStream("E:\\test.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fop);

            bos.write(b);
            bos.flush();
            bos.close();
            fop.close();

            FileInputStream fip = new FileInputStream("E:\\test.txt");
            int c;
            while ((c = fip.read()) != -1) {
                System.out.print((char) c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

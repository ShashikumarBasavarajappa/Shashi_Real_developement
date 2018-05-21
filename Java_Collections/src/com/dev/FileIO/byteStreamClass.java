/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.FileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Shashikumar J B <shashi2466@gmail.com>
 */
/*

In Java, Stream is a channel or a path along which data flows between source and destination. 
There are two kinds of streams - input stream and output stream. Input stream is a path through which 
data is read or fetched from a source(file, memory, or a console). 
While, output stream is a path which is used to write some data to a destination(file, memory or a console).
 */
public class byteStreamClass {

    /*
    
        we have input strea class to read the data
        we have output stream to write the data into it.
    
    input stream  class is a base class of all classes useed to read byte of data from fle, disl]k,memory or console
    
    Methods
    
        int available()
        abstract int read()
        int read(byte[] b)
        close()
        
    OutputStream a base class of all the classes that are used to write bytes to a file, memory or console. 
    OutputStream is an abstract class and hence we can't create its object but we can use its subclasses for writing bytes 
    
    
    Methods
    
    flush()    
    abstract write(int c)
    write(byte[] b)
    close()
    
    
    
    Some of the methods present in the File
    
    boolean createNewFile()
    boolean exists()
    String getName()
    String getParent()
    
    boolean isDirectory()
    
    boolean isFile()
    boolean isHidden()
    boolean canRead()
    
    boolean canWrite()
    long lastModified(
    long length()
    
    
     */
    public static void main(String[] args) throws IOException {

        File f = new File("E:\\test.txt");

        System.out.println("Checkig file : " + f.exists());
        System.out.println("Checking is this file or diectoty " + f.isFile());
        System.out.println("Checking is this file or diectoty " + f.isDirectory());
        System.out.println("Checking is this file or diectoty " + f.isHidden());
        System.out.println("Checking 1 :" + f.getPath());
        System.out.println("Checking 2 :" + f.getName());
        System.out.println("Checking 2 :" + f.getParent());
        System.out.println("Checking 2 :" + f.getAbsolutePath());

        System.out.println(" REad or write : " + f.canRead());
        System.out.println(" REad or write : " + f.canWrite());
        System.out.println(" REad or write : " + f.canExecute());
        int c;
        try {
            FileInputStream ff = new FileInputStream(f);
            while((c = ff.read()) !=-1 ){
               System.out.print( (char)c); 
            }
            
            ff.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}

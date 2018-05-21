/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.multthreading;

/**
 *
 * @author Shashikumar J B <shashi2466@gmail.com>
 */
public class ThreadExm extends Thread{

    public ThreadExm(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Doing the RUn method Here");
        try{
            System.out.println("Inside Thread try block");
            Thread.sleep(1000);
            
            System.out.println("Checking Threading Name :  " +  getName());
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
  
    public static void main(String[] args) {
        ThreadExm t1 =  new ThreadExm("Main Code");
        t1.start();
    }
}

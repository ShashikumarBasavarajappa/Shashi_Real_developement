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
public class ThreadRun2 implements Runnable{

    @Override
    public void run() {
        Thread t1 =  new Thread();
        System.out.println("Thread before : " +  t1.getPriority());
        System.out.println("Checking priority coding Sir");
        t1.setPriority(1);
        
        // this is way you can set your thread priority
        System.out.println("Thread After : " +  t1.getPriority());
    }
    
    
    public static void main(String[] args) {
        ThreadRun2 t2 = new ThreadRun2();
        Thread  t =  new Thread(t2, "new_priority_thread");
        t.start();
    }

}

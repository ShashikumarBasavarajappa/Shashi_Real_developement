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
public class Produsor_Cosumer_problem implements Runnable{

    @Override
    public void run() {
        System.out.println("Checking here");
        synchronized(this){
            notify();
        }
    }

    
   
    public static void main(String[] args) throws InterruptedException {
        
        Produsor_Cosumer_problem p =  new Produsor_Cosumer_problem();
        Thread  t =  new Thread(p, "new Thread");
        t.start();
       synchronized(p){
           p.wait();
           System.out.println("dddddddddddddddddddddddddd");
       }
    }
}

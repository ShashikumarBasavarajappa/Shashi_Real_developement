/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
    1 is lowest priority and 10 is highest priority
    5 is the default thread
    
    Each Thread having perticular time to slicing scheduling
    to Run on the JVM
    

    we have concept like
    Thread.min_priority  -- 1
    Thread.Noraml_prority -- 5
    Thread.Max_priority -- 10
    
    

*/

package com.dev.multthreading;

/**
 * 
 * @author Shashikumar J B <shashi2466@gmail.com>
 */
public class ThreadRun implements Runnable{

    @Override
    public void run() {
       
            System.out.println("-----------");
            try{
                Thread.sleep(100);
                System.out.println("Completed from here");
            }catch(InterruptedException e){
                e.printStackTrace();
            }
    }

    
    public static void main(String[] args) {
        ThreadRun newth =  new ThreadRun();
        Thread t =  new Thread(newth ," new Thread");
        t.start();
    }
}

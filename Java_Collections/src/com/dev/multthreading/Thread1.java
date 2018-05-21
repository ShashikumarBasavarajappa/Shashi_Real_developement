/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.multthreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shashikumar J B <shashi2466@gmail.com>
 */

/*
    BY default JaVa has thread and also called Main() default thread.

    When ever we run the program then by default it's searching for Main because it's by default thread.

 */

 /*
    Checking coding for the Multithreadded code.
 */
public class Thread1 {

    public static void main(String[] args) {
        try {
            // If you run the below code clearly shows the we are running the current thread as Main
            //Output  Thread[main,5,main]
            Thread t = Thread.currentThread();
            System.out.println("t : " + t);
            // Below code for me to check with are all the thread Method
            System.out.println("-------------------------------------");
            
            System.out.println("Name : " + t.getName());
            t.setName("Shashi Coded and setted ");
            System.out.println("After setting the Name : " + t.getName());
            
            System.out.println("Get priority : " + t.getPriority());
            
            System.out.println("Checking Thread is Alive or Not : " + t.isAlive());
            
            System.out.println("Checking Sleep Thread Work--5 sec---");
            
            t.sleep(5000);
            
            System.out.println("After the Thread code executted---");
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}

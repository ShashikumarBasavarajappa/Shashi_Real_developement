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
/*
    interrupt() is calling to interruct thread
 */
public class Threadinterrupt implements Runnable {

    @Override
    public void run() {
        System.out.println("Checking and starting RUn method");
        try {
            if (Thread.interrupted()) {
                System.out.println("Thread was interrupted");
                // here manually we throw by using the throw object.
                throw new InterruptedException();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Threadinterrupt ti = new Threadinterrupt();
        Thread t1 = new Thread(ti, "sample_thread");
        t1.start();
        t1.interrupt();
        // After interrupted we can't able to access to anything.
        System.out.println("T : " + t1.getName());

    }

    /* 
    When a thread was interrupted by interrupt() method before an activity of waiting or sleeping.
When a thread was interrupted by interrupt() method during	an activity of waiting or sleeping.
     */
}

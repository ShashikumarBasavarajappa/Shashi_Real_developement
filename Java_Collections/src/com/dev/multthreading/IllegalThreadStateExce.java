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


    2 ways are there
    
    a. when thread executing the one thread, if you calling the thread start  again then we called
        Illegal thread state execution
    b. After thread has been dead if you call the thread again then we called as the Illegal Thread Stae execution
 */
public class IllegalThreadStateExce implements Runnable {

    @Override
    public void run() {
        System.out.println("_---------_");
        for (int i = 0; i < 10; i++) {
            System.out.println("i : " + i);
        }
    }

    public static void main(String[] args) {
        IllegalThreadStateExce itc = new IllegalThreadStateExce();
        Thread t = new Thread(itc, "Checking");
        t.start();

        t.start();

        // before the code end the execution we are started the another thread so we should carefully view the things
    }

}

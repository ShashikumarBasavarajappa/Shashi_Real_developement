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
class c {

    public void sycn() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Checking code : " + Thread.currentThread() + " : " + i);
        }
    }
}

public class synchronizationBlock implements Runnable {

    c obj1;

    public synchronizationBlock(c obj1) {
        this.obj1 = obj1;
    }

    @Override
    public void run() {
        System.out.println("Current thread exution " + Thread.currentThread());

        // this will help anything you to other than only sychronized black it's going to work
        // checking code
        synchronized (obj1) {
            obj1.sycn();
        }
    }

    public static void main(String[] args) {

        c c1 = new c();

        synchronizationBlock b1 = new synchronizationBlock(c1);
        synchronizationBlock b2 = new synchronizationBlock(c1);

        Thread t1 = new Thread(b1, "coding");
        Thread t2 = new Thread(b2, "coding2");
        t1.start();
        t2.start();
        
        // if you delayed execution and execute also i will not allow to stop, 
        // simply it will start executing same thread after sleep  also.
        
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.interview;

import com.dev.multthreading.synchronizationJava;

/**
 *
 * @author Shashikumar J B <shashi2466@gmail.com>
 */
class A {

    synchronized public void m(A a, B b) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Checking Thread : " + Thread.currentThread());
        }
        // b.m(a, b);

    }

    synchronized public void sync() {
     
        for (int i = 0; i < 3; i++) {
            System.out.println("Checking Thread : " + Thread.currentThread());
        }
    }
}

class B {

   synchronized public void sync() {
     
        for (int i = 0; i < 3; i++) {
            System.out.println("Checking Thread : " + Thread.currentThread());
        }
    }

}

public class Deadlock_prove_code implements Runnable {

    B c1;

    public Deadlock_prove_code(B c1) {
        this.c1 = c1;
    }

    @Override
    public void run() {
           c1.sync();
    }

    public static void main(String[] args) {
        B b = new B();
        Deadlock_prove_code a1 = new Deadlock_prove_code(b);
        Deadlock_prove_code a2 = new Deadlock_prove_code(b);

        Thread t1 = new Thread(a1, "First_thread");
        Thread t2 = new Thread(a2, "Second_thread");

        t1.start();
        t2.start();
    }

}

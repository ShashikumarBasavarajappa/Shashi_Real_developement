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

Deadlock is situation where two or more threads waiting to access a common resource are blocked forever. 

    This is a deadlock situation, where both threads would keep on waiting forever, untill either of two threads would release the lock on its object.


 */
class A {
    
    synchronized public void m(A a, B1 b) {
        System.out.print(Thread.currentThread().getName());
        System.out.println(" thread is in A'a m() method, trying to call B's m() method");
        b.m(a, b);
    }
}

class B1 {
    
    synchronized public void m(A a, B1 b) {
        System.out.print(Thread.currentThread().getName());
        System.out.println(" is in B's m() method, trying to call A's m() method");
        a.m(a, b);
    }
}

public class DeadLockClass implements Runnable{

    
    A a = new A();
    B1 b  = new B1();
    Thread t;

    public DeadLockClass() {
        t = new Thread(this, "My_thread");
        t.start();
        a.m(a,b);
    }
    
    
    @Override
    public void run() {
       b.m(a, b);
    }
    
    public static void main(String[] args) {
        
        new DeadLockClass();
    }
}

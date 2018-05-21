/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
    If the two or more thread started access to shared same resources,
    to avoid the somethings and also smooth execution purpose, we will call the sychronisation

    Sychronisation will check only one resources will have access to one resources so that avoidng deadlock kind of the situation

    2 ways we can do it
    a. by sychronizing method
    b. by Sychrinising the code which required completely. (Block of code)
        
 */
package com.dev.multthreading;

/**
 *
 * @author Shashikumar J B <shashi2466@gmail.com>
 */
class B {

   synchronized public void sync() //a non-synchronized method
    {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread() + " " + i);
        }

    }
}

public class synchronizationJava implements Runnable {

    B obj;

    public synchronizationJava(B obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        obj.sync();
    }

    public static void main(String[] args) {
        B b = new B();
        synchronizationJava a1 = new synchronizationJava(b);
        synchronizationJava a2 = new synchronizationJava(b);

        Thread t1 = new Thread(a1, "First_thread");
        Thread t2 = new Thread(a2, "Second_thread");

        t1.start();
        t2.start();

            // when you do the codin with sychronzed then easily it will execute i wll not allow any another thread
            // until execution complete i will execute and break.
            
            
            // withoput sychronized the code will execute in any of the ways there is not way to stop the single to execute
            //everytime different thread will execute.
            
            
            
            //A class method marked with synchronized keyword avoids the conflict between two threads wanting to execute it at the same time, by allowing the first thread executing it to have its sole access
            
    }

}

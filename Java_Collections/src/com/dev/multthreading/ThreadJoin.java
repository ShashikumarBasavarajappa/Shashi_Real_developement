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

    If the Thread waiting to execute another thread then this join concept will help you out.
    
 */
public class ThreadJoin implements Runnable {

    @Override
    public void run() {
        System.out.println("_--------_");
        Thread th = Thread.currentThread();
        try {
            for (int i = 0; i < 3; i++) {
                Thread.sleep(1000); //This will make this thread sleep for 1000 ms.
                System.out.println(i);
            }
            System.out.println(th.getName() + " completed");
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted" + e);
        }
    }

    public static void main(String[] args) {
        ThreadJoin tj = new ThreadJoin();
        Thread t = new Thread(tj, "Jointhread");
        //t.setPriority(1);
        t.start();

        try {
            t.join();
            /*
                Without join below state ment will execute i will not wait for anything 
                but if you have specified the join then it will wait for the another function to complete
                
            
                The code is inside the main() method, hence, the main thread(default thread) runs automatically.

                In the main() method, we have created a thread with the name, OtherThread, pointed by th.
                Method call th.start() starts the execution of the OtherThread.
                Method th.join() in main(), makes the main thread wait for the OtherThread to finish its execution.
                In the run() method of OtherThread, a for-loop makes the OtherTread sleep for 1 seconds, thrice.
                Once OtherThread finishes its execution, main thread continues and "Main thread ends" is printed.

             */
            System.out.println("+++++++++++++++++++++");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

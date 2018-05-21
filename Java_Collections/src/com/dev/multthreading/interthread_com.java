/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.multthreading;

/*


    wait()- This method makes a thread wait for the other thread to complete its work on the same object.
    notify()- This method is used to notify or wake up the thread that was waiting(after calling wait() method) on the same object
    notifyAll()- This method is used to notify or wake up all the threads that were waiting(after calling wait() method) on the same object.


 */
/**
 *
 * @author Shashikumar J B <shashi2466@gmail.com>
 */
public class interthread_com implements Runnable {

    @Override
    public void run() {
        synchronized (this) {
            System.out.println("newThread running and printing table of 5");
            for (int i = 1; i <= 10; i++) {
                System.out.println("5 x " + i + " = " + (5 * i));
            }

            notify();
        }
    }

    public static void main(String[] args) {

        interthread_com icom = new interthread_com();
        Thread t1 = new Thread(icom, "mythread");
        t1.start();

        synchronized (icom) {
            try {
                // remember untill you say notify ths will not work
                // wait means it will wait until somethread will notify()
                icom.wait();
                System.out.println("main thread running and printing table of 6");
                for (int i = 1; i <= 10; i++) {
                    System.out.println("6 x " + i + " = " + (6 * i));
                }

            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

}

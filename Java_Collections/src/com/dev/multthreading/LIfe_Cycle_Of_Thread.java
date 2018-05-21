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
public class LIfe_Cycle_Of_Thread {
    /*
        1. New state in which object of thread is created and it's not started.
            Once moved to the crossed this step it's impossible to revert back.
        2. Runnable : Thread enter to this step, when start has been called on it.
        3. Thread in RUnnable State consider as the Alive state.
        4. During Run State thread can enter into the waiting/blocked state. or final Dead State.
        5. 
    
        Thread can ENter Waiting state in 3 states.
    
    
        a. thrad has called wait or itself it's in waiting state.
        b. when thread called the sleep, asking for the sleep duration.
        c. Thread waiting for input and output resources to be free on that time.
    
    
        If the Thread enter into the dead state means it's sucessfully Done with his work.
    
        //IllegalThreadStateException
    
    
        Run method must be implement the Thread class ( Run() must be compulsory).
    
        The run() method must be overridden when we extend Thread class, or,
    
        The run() method must be implemented when we implement the Runnable interface. 
    
        
    */
    

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.innerclass;

/**
 *
 * @author Shashikumar J B <shashi2466@gmail.com>
 */


/*
    Another way of anonymous class declaration
    
 */
interface Another_interface_class {

    void check();
}

public class Anonymous_class_Interface {

    public static void main(String[] args) {
        Anonymous_Inner_Class aic =  new Anonymous_Inner_Class(){
            public void check(){
                    System.out.println("Interface Checking codeing Sir");
            }
        };
        
        // Once we created the interface method we will access those method easily
        // Above i created the method for the interface method
        // below we are calling that method easily
        aic.check();
        
    }
}

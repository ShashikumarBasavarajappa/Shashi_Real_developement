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
// USing abstract way we implemented the code

abstract class Person{
    abstract  void eat();
}

public class Anonymous_Inner_Class {
    
    /*
    We should Anonymous class means does not have name two ways
    
    a. class (abstrct or concrete)
    b. Interface
    */
    
    
    public static void main(String[] args) {
        Person p =  new Person(){
            void eat(){
                System.out.println("Abstract Anonymous class imple");
            }
        };
        
        p.eat();
    }    

    void check() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

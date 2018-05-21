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
public class Local_Inner_Class {

    /*
        Local Inner class, means class created inside the method called local inner class
        
     */
    private final int data = 10;

    void display() {
        class Local {

            void msg() {
                System.out.println("I'm inside the Inner class Please work : " + data);
            }
        }

        Local l = new Local();
        l.msg();
    }

    public static void main(String[] args) {
        Local_Inner_Class lc =  new Local_Inner_Class();
        lc.display();
    }
}

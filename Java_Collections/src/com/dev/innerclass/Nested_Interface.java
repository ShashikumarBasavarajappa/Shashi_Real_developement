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
interface xyz {

    interface abc {

        void checking();
    }
}

public class Nested_Interface implements xyz.abc {

    /*
        Nested Interface is the in which declared interface under another interface or class.
    
        Nested INterface are referenced accessed from outinterface References.
    


        General syntex
    
        class interface{
            interface jjjj {
            
            }
        }
    
        interface sdas{
             interface jjjj {
            
            }
        }
    
     */
    public void checking() {
        System.out.println("Doing lot of TImes Bro....");
    }

    public static void main(String[] args) {
        xyz.abc mmm = new Nested_Interface();
        mmm.checking();
    }
}

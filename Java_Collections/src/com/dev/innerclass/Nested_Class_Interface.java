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

class Tested{
    interface Coded{
           void msg1();
    } 
        // this is the way nested clas interface wat
    // this 
}
public class Nested_Class_Interface implements Tested.Coded{
    public void msg1(){
        System.out.println("DOne Dana DOne");
    }
    public static void main(String[] args) {
        Tested.Coded tc =  new Nested_Class_Interface(); // this upcasting way of access
        tc.msg1();
    }
}

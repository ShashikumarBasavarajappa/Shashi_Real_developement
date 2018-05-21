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
public class Static_Inner_Class {

    static int data_check = 10;
    static class Inner_Main{
        void msg(){
            // here if you see the static member can access onlt static variable non static memeber
            // So i'm changng the data_check to static memeber let's it's going to work or not.
            System.out.println("Main Checking : " + data_check);
        }
    }
    
    public static void main(String[] args) {
        Static_Inner_Class.Inner_Main sic = new Static_Inner_Class.Inner_Main();
        sic.msg();
        
    }
}

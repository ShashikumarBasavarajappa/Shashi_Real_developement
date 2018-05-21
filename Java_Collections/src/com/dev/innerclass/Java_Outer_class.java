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
public class Java_Outer_class {

    // we are making class and menerbs in one place so it;s more readble formate.
    
    public class Java_Inner_class {
        public void test(){
            System.out.println("Checkng main class function once");
        }
    }
    
    public static void main(String[] args) {
        
       Java_Outer_class jo  =  new Java_Outer_class();
       
       // we should remember from outclass we need to create the object  for the inner class
       Java_Outer_class.Java_Inner_class jn = jo.new  Java_Inner_class();
       
       jn.test();
       
        System.out.println("Connected Sir");
        
        // what is the difference between the nested and normal inner class
        
        
        
       // nested class two times a. static and another one b. non-static.
       
       // this is the example for the member class
       
       
    }
}

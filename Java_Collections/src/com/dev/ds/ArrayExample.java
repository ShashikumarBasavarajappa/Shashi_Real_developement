/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.ds;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.lang.model.element.Element;

/**
 *
 * @author Shashikumar J B <shashi2466@gmail.com>
 */
public class ArrayExample {

    public static void main(String[] args) {

        //int[] aa  = new int[7];
        // this is logic of writing missing elements froml lenear code
        int[] aa = new int[] {1, 4, 5, 7, 8,9,10};
        ArrayList<Integer> aop =  new ArrayList<>();
       // List<Integer> aop = new List<>();
        System.out.println("Size : " + aa.length);
        //i'm failing in converting array to array list or else this loop also not needed
        for(int i=0;i<aa.length;i++){
            aop.add(aa[i]);
        }
        ArrayList<Integer> aop2 =  new ArrayList<>();
        try{
            
            for(int j=1;j<=aa.length;j++){
                if(!aop.contains(j)){
                    aop2.add(j);
                }
            }
            System.out.println("Values are : " + aop2);

        }catch(UnsupportedOperationException e){
            e.printStackTrace();
        }
        for(int i=1;i<=aa.length;i++){
            
        }

    }

}

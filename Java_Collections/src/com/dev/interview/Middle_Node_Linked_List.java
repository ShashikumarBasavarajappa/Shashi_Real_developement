/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.interview;

import java.util.LinkedList;

/**
 *
 * @author Shashikumar J B <shashi2466@gmail.com>
 */
public class Middle_Node_Linked_List {

    public static void main(String[] args) {

        LinkedList<Integer> Checking = new LinkedList<>();

        int[] sample = {40, 20, 60, 10, 50, 30};
        //int[] sample = {40, 20, 60};
        //int[] sample = {40};
        for (int i = 0; i < sample.length; i++) {
            Checking.add(sample[i]);
        }
        int mid = (int) Math.ceil(Checking.size()/2);
        System.out.println("size : " + Checking.get(mid));
        
    }
}

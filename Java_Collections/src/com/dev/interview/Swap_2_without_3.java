/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.interview;

/**
 *
 * @author Shashikumar J B <shashi2466@gmail.com>
 */
public class Swap_2_without_3 {

    public void swap_v(int a, int b) {
        System.out.println("Before Changes ; " + " a : " + a + " b : " + b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Changes ; " + " a : " + a + " b : " + b);
    }

    public static void main(String[] args) {

        new Swap_2_without_3().swap_v(2, 3);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.interview;

import java.util.ArrayList;

/**
 *
 * @author Shashikumar J B <shashi2466@gmail.com>
 */
public class JavaFIbonessir {

    public void fibonessi(int num) {

        ArrayList<Integer> inec = new ArrayList<>();
        int num1 = 0;
        int num2 = 1;
        inec.add(num1);
        inec.add(num2);

        do {

            num2 = num1 + num2;
            num1 = num2 - num1;
            if (num2 <= num) {
                inec.add(num2);
            }
        } while (num2 <= num);

        System.out.println(inec);

    }

    public static void main(String[] args) {
        new JavaFIbonessir().fibonessi(100);
    }

}

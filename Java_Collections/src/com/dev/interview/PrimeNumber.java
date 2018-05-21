/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.interview;

import java.util.Scanner;

/**
 *
 * @author Shashikumar J B <shashi2466@gmail.com>
 */
public class PrimeNumber {
    //Number divided by 1 and itself called the prime number

    public boolean is_prime(int num) {
        boolean shashi = false;
        for (int i = 2; i < num; i++) {
            if (num%i == 0) {
                System.out.println("jjj : " + i + " : " + (num%i));
                shashi = false;
                break;
            } else {
                shashi = true;
            }
        }
        return shashi;
    }

    public static void main(String[] args) {

        int num = 5;
        System.out.println("Checking: " + new PrimeNumber().is_prime(100));
    }

}

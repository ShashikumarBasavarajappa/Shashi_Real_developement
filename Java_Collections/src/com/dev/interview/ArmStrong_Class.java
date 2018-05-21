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
public class ArmStrong_Class {

    private static boolean isArmStrong(int number) {
        int result = 0;
        int orig = number;
        while (number != 0) {
            int remainder = number % 10;
            result = result + remainder * remainder * remainder;
            number = number / 10;
        }
        //number is Armstrong return true
        if (orig == result) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        //input number to check if its Armstrong number
        System.out.println("Please enter a 3 digit number to find if its an Armstrong number:");
        int number = new Scanner(System.in).nextInt();
        //printing result
        if (isArmStrong(number)) {
            System.out.println("Number : " + number + " is an Armstrong number");
        } else {
            System.out.println("Number : " + number + " is not an Armstrong number");
        }
    }
}

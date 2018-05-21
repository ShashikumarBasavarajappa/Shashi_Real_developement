package com.dev.collections;

/*
We should familiar correctly when to use the Arraylist and linked list

Arrya we need to REszing when we adding edlements if size reaches in Array

a. Good for General purpose
b. use default
c. More Cpu cache sympathetic

Linked List is head to tail connection and also easy to add or delete.
IN Array List it's very difficult and also not good do with better performance
because we need to copy to another array also we need to shift one by one.
 */
// Let's Check Below code to check the purpormance of the list and array.

import java.util.ArrayList;
import java.util.LinkedList;

public class Another_Class_Test {

    public static void main(String[] args) {
        ArrayList<Integer> arry1 = new ArrayList<Integer>();


        arry1.add(10);
        arry1.add(11);
        arry1.add(12);
        arry1.add(13);
        arry1.add(14);
        arry1.add(15);
        arry1.add(16);
        arry1.add(17);
        arry1.add(18);
        arry1.add(19);
        arry1.add(20);
        arry1.add(21);


        // System.out.println(arry1);
        //  Now we will do the search Operation

        System.out.println(arry1.contains(21));

    }
}

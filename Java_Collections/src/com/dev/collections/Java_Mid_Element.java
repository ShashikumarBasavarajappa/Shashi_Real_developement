package com.dev.collections;

import java.util.LinkedList;

public class Java_Mid_Element {

    public static void main(String[] args) {

        LinkedList<Integer> Checking_code =  new LinkedList<Integer>();

        for(int i=0;i<10;i++){
            Checking_code.add(i);
        }

        System.out.println(Checking_code.indexOf((Checking_code.size()/2)));

    }
}

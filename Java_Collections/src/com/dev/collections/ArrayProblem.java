package com.dev.collections;

import java.util.Arrays;

public class ArrayProblem {

    public static void main(String[] args) {

        Product pp = new Product("Shashi ", 82);
        Product pp1 = new Product("Kumar ", 60);

        Product[] p2 = {pp, pp1};
        System.out.println(Arrays.toString(p2));

        // Java Problem Are showing Here
        // 1. Array can't able to strdech there size, so that we need to declare the
        // size again and again.
        final Product p3 = new Product("welCome", 65);

        try {

            p2[2] = p3;
            System.out.println(Arrays.toString(p2));
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        System.out.println("=======2nd Problem=========");

        // second problem with the duplicate in data we can able to insert
        // we can't able to avoid the duplicate all these problem can overcome from the Collections

        Product pp5 = new Product("Kumar ", 60);

        Product[] p7 = {pp, pp1, pp5};
        System.out.println(Arrays.toString(p7));
    }

}

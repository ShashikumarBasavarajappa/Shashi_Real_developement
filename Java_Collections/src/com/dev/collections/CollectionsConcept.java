package com.dev.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionsConcept {
    public static void main(String[] args) {
        Product p1 = new Product("S1", 25);
        Product p2 = new Product("S2", 50);
        Product p3 = new Product("S3", 75);

        Collection<Product> p = new ArrayList<Product>();
        p.add(p1);
        p.add(p2);
        p.add(p3);

        System.out.println(p);

        Iterator<Product> pp = p.iterator();

        while (pp.hasNext()) {
            Product p6 = pp.next();

            System.out.println(p6);

            if (p6.getWeight() >= 50) {
                System.out.println(" Above 50-");

            } else {
                System.out.println("below 50 -");
            }
        }

        System.out.println("---------For Each Loop Concept----------");
        for (Product pppp : p) {
            System.out.println(pppp);
        }

        System.out.println(" Here we are checking inbuild function easily ");

        System.out.println(p.size());
        System.out.println(p.isEmpty());
        System.out.println(p.contains(p1));

        System.out.println(p.remove(p1));

        // check once is is generating the any error if error
        // Handle Using the Exception Handling
        System.out.println(p.remove(p1));

        System.out.println("------- Done End Done------");
    }

}

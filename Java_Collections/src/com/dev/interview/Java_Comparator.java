/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.interview;

import java.util.*;
import java.lang.*;
import java.io.*;

/**
 *
 * @author Shashikumar J B <shashi2466@gmail.com>
 */
public class Java_Comparator {

    private static class Sortbyname implements Comparator<Employee> {

        public Sortbyname() {
        }

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.Name.compareTo(o2.Name);
        }
    }
    
    
  

    public static void main(String[] args) {
        Employee emp = new Employee("Shashikumar",43);
        Employee emp1 = new Employee("Jakkali",1);
        Employee emp2 = new Employee("Ashok",42);

        ArrayList<Employee> emarrp1 = new ArrayList<>();

        emarrp1.add(emp);
        emarrp1.add(emp1);
        emarrp1.add(emp2);
        System.out.println("before changes : " + emarrp1);

        Collections.sort(emarrp1, new Sortbyname());

        System.out.println("after changes : " + emarrp1);

    }
}

package com.dev.collections;

public class TwoSum {
    public static void findTwoSum(int[] list, int sum) {

        int[] n1 = new int[2];
        for(int i=0;i<list.length;i++) {
            for (int j = i + 1; j < list.length; j++) {
                if((list[i]+list[j]) == sum) {
                    System.out.println(list[i] + " " + list[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
         findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);

    }
}
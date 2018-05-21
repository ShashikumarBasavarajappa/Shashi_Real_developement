package com.dev.collections;

public class Two_Sorted_Array {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        double median_value = 0;
        median_value = (nums1.length + nums2.length)/2;
        return  median_value;
    }

    public static void main(String[] args) {
        /*
        int[] nums1 = new  int[1, 2];
        int[] nums2 = [3, 4];
        Two_Sorted_Array t1 = new Two_Sorted_Array();
        System.out.println(t1.findMedianSortedArrays(nums1,nums2));
        */
    }
}

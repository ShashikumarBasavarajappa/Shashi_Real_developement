package com.dev.Array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class Array_speed {

	public static void divideandconcer(int start,int end,int mid,int search) throws InterruptedException {
		
		
		if(search == mid) {
			System.out.println("-===== FOund there====" + mid);
			
		}else if(search >  mid) {
			start = mid+1;
			mid = (end + start)/2;
			divideandconcer(start,end,mid,search);
		}else if( search < mid) {
			end = mid-1;
		 
			mid = (end + start)/2;						
			divideandconcer(start,end,mid,search);
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		int num = 10;
		long startTime = System.nanoTime();
		//code
		
		Random rand = new Random();
		ArrayList<Integer> test =  new ArrayList<>();
		int count = 0;
		while(count < 1000) {
			//test.add((int) (Math.random() * count) );
			test.add(count);
			count++;
		}
		
		int search  = 400;
		/*
		for(int i =0 ;i< test.size();i++) {
			if(test.get(i) == search) {
				System.out.println("=======Found here=====");
			}
		}
		*/
		Collections.sort(test);
		divideandconcer(0,test.size(),(test.size() /2), search);
		//1819957
		//4830914
		//3564785
		/*
		test.add(1000);
		Iterator itr =  test.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(test.size());
		*/
		long endTime = System.nanoTime();
		System.out.println("TIme Took "+(endTime - startTime) + " ns");
	}
}

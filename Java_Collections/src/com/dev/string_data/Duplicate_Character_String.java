/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.string_data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Shashikumar J B <shashi2466@gmail.com>
 */
public class Duplicate_Character_String {

	public static void main(String[] args) {

		String s = "shashikumkar";

		char[] ch = s.toCharArray();

		List<char[]> asList = Arrays.asList(ch);

		List<Character> ch1 = new ArrayList<>();

		// way to convert the chararray to the List

		for (int i = 0; i < ch.length; i++) {
			if (ch1.contains(ch[i])) {
				System.out.println("Duplicate value : " + ch[i]);
			} else {
				ch1.add(ch[i]);
			}
		}
	}

}

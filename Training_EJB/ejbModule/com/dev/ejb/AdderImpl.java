package com.dev.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class AdderImpl
 */
@Stateless(mappedName = "st1")
public class AdderImpl implements AdderImplRemote {

	public int add(int a, int b) {
		System.out.println("coming here man" + (a + b));
		return a + b;
	}
}

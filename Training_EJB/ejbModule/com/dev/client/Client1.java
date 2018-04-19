package com.dev.client;

import javax.naming.Context;
import javax.naming.InitialContext;

import com.dev.ejb.AdderImplRemote;

public class Client1 {
	public static void main(String[] args) throws Exception {
		System.out.println("****************************");
		Context context = new InitialContext();
		System.out.println("************************s****");
		AdderImplRemote addimpl = (AdderImplRemote)context.lookup("st1");
		System.out.println("************************s*s***");
		int add_num  = addimpl.add(2, 3);
		System.out.println("========" +  add_num);
	}

}

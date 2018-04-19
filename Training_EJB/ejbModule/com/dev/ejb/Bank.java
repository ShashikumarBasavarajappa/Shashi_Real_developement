package com.dev.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class Bank
 */
@Stateful(mappedName="stateful123")
@LocalBean
public class Bank implements BankRemote {

	private int amount =0;
    public Bank() {
        // TODO Auto-generated constructor stub
    }


	public boolean withdraw(int amount) {
		// TODO Auto-generated method stub
		if(amount <= this.amount) {
			this.amount  = amount;
			return true;
		}else {
			return false;
		}
	}


	public void deposit(int amount) {
		this.amount+=  amount;		
	}

	public int getbalance() {
		return amount;
	}

}

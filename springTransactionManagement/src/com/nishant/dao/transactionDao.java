package com.nishant.dao;

import com.nishant.model.Account;

public interface transactionDao {
	 
	public abstract void withdrawl(Account fromAccount,Account toAccount,double amount);
	public abstract void deposit(Account fromAccount,Account toAccount,double amount);

}

package com.nishant.service;

import com.nishant.daoImpl.transactionDaoImpl;
import com.nishant.model.Account;

public interface transactionService {
	
	
          
	public abstract void transferFund(Account fromAccount,Account toAccount,double amount);
	
}

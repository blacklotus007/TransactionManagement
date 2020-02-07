package com.nishant.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.nishant.daoImpl.transactionDaoImpl;
import com.nishant.model.Account;

public class transactionServiceImpl implements transactionService {
	private transactionDaoImpl transactionData;
	
	public void setTransactionData(transactionDaoImpl transactionData) {
		this.transactionData = transactionData;
	}

	@Override
	public void transferFund(Account fromAccount, Account toAccount, double amount) {
		// TODO Auto-generated method stub
		transactionData.withdrawl(fromAccount, toAccount, amount);
		transactionData.deposit(fromAccount, toAccount, amount);
		

	}

}

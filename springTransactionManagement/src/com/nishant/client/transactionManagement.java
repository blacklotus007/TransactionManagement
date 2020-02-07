package com.nishant.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nishant.model.Account;
import com.nishant.service.transactionServiceImpl;

public class transactionManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		transactionServiceImpl transService = context.getBean(transactionServiceImpl.class);
		
	Account fromAccount = new Account();
	fromAccount.setAccountNumber(123456789);
	
	Account toAccount = new Account();
	toAccount.setAccountNumber(123456781);
	
	
		
		transService.transferFund(fromAccount,toAccount,12000);

	}

}

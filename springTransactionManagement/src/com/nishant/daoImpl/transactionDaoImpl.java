package com.nishant.daoImpl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nishant.dao.transactionDao;
import com.nishant.dao.mapper.AccountRowMapper;
import com.nishant.model.Account;

public class transactionDaoImpl implements transactionDao{
	
	private JdbcTemplate jdbctemplate;
	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	@Override
	public void withdrawl(Account fromAccount, Account toAccount, double amount) {
		// TODO Auto-generated method stub
				Account account = getDbData(fromAccount);
		 double rupee = account.getAmount()-amount;
		int update = jdbctemplate.update("UPDATE hdfc_bank SET amount=? WHERE account_number=?",rupee,fromAccount.getAccountNumber());
		if(update>0)
		{
			System.out.println("Successfull");
		}
		else
		{
			System.out.println("Failed");
		}
		
	}

	private Account getDbData(Account account) {
		// TODO Auto-generated method stub\
		
		String sql = "Select * from hdfc_bank where account_number = ?";
	    return jdbctemplate.queryForObject(sql, new AccountRowMapper(), account.getAccountNumber());  //(sql, new AccountRowMapper(),account.getAccountNumber());
		
	}

	@Override
	public void deposit(Account fromAccount, Account toAccount, double amount) {
		// TODO Auto-generated method stub
		Account account = getDbData(toAccount);
		double rupee = account.getAmount()+amount;
		int update = jdbctemplate.update("UPDATE hdfc_bank SET amount=? WHERE account_number=?",rupee,toAccount.getAccountNumber());
		if(update>0)
		{
			System.out.println("Successfull");
		}
		else
		{
			System.out.println("Failed");
		}
	}

}

package com.nishant.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nishant.model.Account;

public class AccountRowMapper implements RowMapper<Account> {

	@Override
	public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Account account = new Account();
		account.setAccountNumber(rs.getLong(1));
		account.setAccountType(rs.getString(2));
		account.setAccountHolderName(rs.getString(3));
		account.setAmount(rs.getDouble(4));
		
		return account;
	}

}

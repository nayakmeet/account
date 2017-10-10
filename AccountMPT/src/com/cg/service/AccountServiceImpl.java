package com.cg.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;

import com.cg.bean.AccountBean;
import com.cg.dao.AccountDaoImpl;
import com.cg.dao.IAccountDao;

public class AccountServiceImpl implements IAccountService {

	IAccountDao dao=new AccountDaoImpl();
	
	@Override
	public ArrayList<Integer> getId() {
		
		return dao.getId();
	}

	@Override
	public int addDetails(AccountBean bean) throws NamingException, IOException, SQLException {
		
		int w=bean.getWith_amt();
		
		return dao.addDetails(bean);
	}

	@Override
	public int getBalance(int withdraw) {
	
		int total = 50000;
		total=(total-withdraw);
		
		return(total) ;
	}

	@Override
	public int getTransId() throws NamingException, IOException {
	
		return dao.getTransId();
	}




}



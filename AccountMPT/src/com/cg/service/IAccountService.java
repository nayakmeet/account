package com.cg.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;

import com.cg.bean.AccountBean;


public interface IAccountService {

	public ArrayList<Integer>  getId();

	public int addDetails(AccountBean bean) throws NamingException, IOException, SQLException;

	public int getBalance(int withdraw);

	public int getTransId() throws NamingException, IOException;

	

}

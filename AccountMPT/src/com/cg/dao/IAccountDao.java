package com.cg.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;

import com.cg.bean.AccountBean;

public interface IAccountDao {

 public	ArrayList<Integer> getId();

public int addDetails(AccountBean bean) throws NamingException, IOException, SQLException;

public int getTransId() throws NamingException, IOException;



}

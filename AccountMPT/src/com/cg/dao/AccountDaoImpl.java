package com.cg.dao;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.NamingException;

import org.jboss.logging.Logger;

import com.cg.bean.AccountBean;
import com.cg.dbutil.DbUtil;

public class AccountDaoImpl implements IAccountDao{
	
	Logger log=Logger.getLogger(AccountDaoImpl.class);
	
			int value = 0;
	Connection conn=null;
	
	@Override
	public ArrayList<Integer> getId() {
		
		{
			ArrayList<Integer> list = new ArrayList<Integer>();
				try
					{
				conn=DbUtil.getConnection();
				String str="Select acc_id from account_details";
				PreparedStatement pst=conn.prepareStatement(str);
				ResultSet rs= pst.executeQuery();
				while(rs.next())
				{
					int ids=rs.getInt(1);
					list.add(ids);
				}
			}	
			catch(SQLException e)
			{
					e.printStackTrace();
			}
			 catch (NamingException e) 
			{
				e.printStackTrace();
			}
			catch (IOException e) {
					e.printStackTrace();
			}
			return list;
			
	}

}

	@Override
	public int addDetails(AccountBean bean) throws NamingException, IOException, SQLException {
		

		int rows=0;
	
			
				conn=DbUtil.getConnection();
				System.out.println(conn);
				PreparedStatement ps=conn.prepareStatement("insert into user_data values(?,?,?,?, transac_id_seq.nextval)");
				ps.setInt(1,bean.getAccid());
				ps.setString(2,bean.getAccType());
				ps.setInt(3, bean.getWith_amt());
				ps.setInt(4,bean.getBalance());
				rows=ps.executeUpdate();
				
				if(rows==1)
				{
					log.info("Data Succesfully Entered.");
				}
				System.out.println(rows);

		return rows;
	
	
	
	}

	@Override
	public int getTransId() throws NamingException, IOException {
		int id=0;
		try
		{
			conn=DbUtil.getConnection();
			String str="select transac_id_seq.nextval from dual";
			Statement pst=conn.createStatement();
			ResultSet rs=pst.executeQuery(str);
			
			while(rs.next())
			{
				id=rs.getInt(1);
			}
			System.out.println("in dao"+id);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return id;
	}}

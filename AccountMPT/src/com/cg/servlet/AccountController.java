package com.cg.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.bean.AccountBean;
import com.cg.service.AccountServiceImpl;
import com.cg.service.IAccountService;



@WebServlet("*.obj")
public class AccountController extends HttpServlet {

       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int res = 0;
		String path= request.getServletPath();
		String target=null;
		AccountBean bean=new AccountBean();
		IAccountService service=new AccountServiceImpl();
		HttpSession session=request.getSession();
		
		switch(path)
		{
		case "/get.obj":
			
			target="AddAccount.jsp";
			ArrayList<Integer> list = new ArrayList<Integer>();
			list=service.getId();
			session.setAttribute("list",list);
			for(Integer i:list)
			{
				System.out.println(i);
			}
			break;
			
		case "/insert.obj":
			try
			{
			String AccountId=request.getParameter("accid");
			int aid=Integer.parseInt(AccountId);
			
			String accountType=request.getParameter("accType");
			
			String Withamt=request.getParameter("withdraw");
			int withdraw=Integer.parseInt(Withamt);
			
			int balance = service.getBalance(withdraw);
			
			int trans_id=service.getTransId();
			
			
	
			bean.setAccid(aid);
			bean.setAccType(accountType);
			bean.setWith_amt(withdraw);
			bean.setBalance(balance);
			bean.setTransId(trans_id);
			res = service.addDetails(bean);
			System.out.println(res);
			
		
			} 
			
			
			catch (NamingException e) 
			{
				e.printStackTrace();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			System.out.println(res);
			
			if(res==1)
				{		
				session.setAttribute("id", bean.getAccid());
				session.setAttribute("type",bean.getAccType() );
				session.setAttribute("withdraw",bean.getWith_amt());
				session.setAttribute("balance",bean.getBalance());
				session.setAttribute("transactionId",bean.getTransId());
					target="Display.jsp";
				}
			else
			{
				target="Error.jsp";
			}
			break;}
		RequestDispatcher rd  = request.getRequestDispatcher(target);
		rd.forward(request, response);

}}

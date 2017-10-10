<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="mycss.css"  rel="stylesheet"/>
</head>
<body>

<%
int id = Integer.parseInt(session.getAttribute("id").toString());
String type = session.getAttribute("type").toString();
int withdraw = Integer.parseInt(session.getAttribute("withdraw").toString());
int balance = Integer.parseInt(session.getAttribute("balance").toString());
int transid=Integer.parseInt(session.getAttribute("transactionId").toString());

%>
<table>
<tr>
<td>Account id:</td><td><%=id %></td>
</tr>
<tr>
<td>Account Type:</td><td><%=type %></td>
</tr>
<tr>
<td>Withdraw Amount:</td><td><%=withdraw %></td>
</tr>
<tr>
<td>Balance:</td><td><%=balance %></td>
</tr>
<tr>
<td>TransId:</td><td><%=transid %></td>
</tr>
</table>
</body>
</html>
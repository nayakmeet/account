<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@taglib 
    uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="mycss.css"  rel="stylesheet"/>
</head>
<body>
<form action="insert.obj">
<table align="center" border="5px">

<tr><td>AccountId</td>
<td>
<select id="accid" name="accid">
	<c:forEach items="${sessionScope.list }" var="Accid">
	<option value="${Accid}">${Accid} </option>
	</c:forEach>
	</select>
	</td>
		</tr>

<tr><td>Account Type</td>
<td><select id=accType name="accType">
<option value="SelectValue">--Select value--</option>
		<option value="saving">Savings</option>
		<option value="current">Current</option>
	</select>
	</td>
		</tr>

<tr>
<td>Amount to be Withdrawn</td>
<td><input type="text" name="withdraw"></td>
</tr>

<tr> <th colspan="2"><button  type="submit" class="btn" > Submit </button ></th></tr>

</body>
</html>
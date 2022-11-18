<%@page import="com.model.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% Customer customer = (Customer)request.getAttribute("cu"); %>



<body>
<form action="update">
<pre>
<input type="hidden" name="id" value="<%=customer.getId() %>"><br><br>
NAME       : <input type="text" name="name" value="<%=customer.getName()%>"><br><br>
ADDRESS    : <input type="text" name="address" value="<%=customer.getAddress()%>"><br><br>
USERNAME   : <input type="text" name="uname" value="<%=customer.getUname()%>"><br><br>
PASS       : <input type="password" name="pass" value="<%=customer.getPass()%>"><br><br>


<input type="submit" value="Update">


</body>
</html>
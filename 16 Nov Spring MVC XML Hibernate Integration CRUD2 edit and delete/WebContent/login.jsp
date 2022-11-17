<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>

<style>
.button {
  background-color: #4CAF50;;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}
</style>

<body>
<h1 style="background-color:LightGray;">Login Here</h1>
<% String s = (String)request.getAttribute("msg"); %>
<%if(s!=null){ %>
<% out.print(s); %><br></br>
<%} %>


<form action="log">
USERNAME : <input type="text" name="uname"><br><br>
PASSWORD : <input type="text" name="pass"><br></br>

<input class="button" type="submit" value="login">

</form>
</body>
</html>
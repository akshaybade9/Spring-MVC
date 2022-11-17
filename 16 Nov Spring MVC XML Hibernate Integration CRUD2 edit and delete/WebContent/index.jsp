<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Login Page</title>
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
<h1 style="background-color:LightGray;">Student Portal</h1>

<a class="button" href="login.jsp">Login</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a class="button" href="register.jsp">Register</a><br></br>

<button type="button"
onclick="document.getElementById('demo').innerHTML = Date()">
Click me to display Date and Time.</button>

<p id="demo"></p>


</body>
</html>
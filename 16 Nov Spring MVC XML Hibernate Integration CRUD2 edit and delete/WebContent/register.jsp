<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>

<meta charset="ISO-8859-1">
<title>Register Page</title>
</head>
<style>
body {background-color: powderblue;}
.button {
  background-color: #4CAF50;
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




<body 
>
<h1 >Register Here</h1>

<form action="reg">
<pre>
ID         : <input type="text" name="id"><br><br>
NAME       : <input type="text" name="name"><br><br>
ADDRESS    : <input type="text" name="address"><br><br>
USERNAME   : <input type="text" name="uname"><br><br>
PASS       : <input type="text" name="pass"><br><br>


<input class="button" type="submit"  value="Register">

</pre>
</form>
</body>
</html>
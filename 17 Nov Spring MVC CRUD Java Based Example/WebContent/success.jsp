<%@page import="com.model.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Student List</title>
</head>


<script type="text/javascript">


function editData() {
	
	alert("Do You Want To Edit...!");
	document.mypage.action="edit";
	document.mypage.submit();
}


function deletData() {
	
	alert("Do You Want To Delete...!");
	document.mypage.action="delete";
	document.mypage.submit();
}





</script>








<body>


<%List<Customer> list = (List)request.getAttribute("cl"); %>





<form name="mypage">

<table border="3">


<thead>
<tr>
<th>SELECT</th>
<th>ID</th>
<th>NAME</th>
<th>ADDRESS</th>
<th>USERNAME</th>
<th>PASSWORD</th>
<th>EDIT</th>
<th>DELETE</th>
</tr>
</thead>




<tbody>
<tr>
<% for(Customer c : list){ %>
<td><input type="radio" name="select" value="<%=c.getId()%>"></td>
<td><%=c.getId()%></td>
<td><%=c.getName()%></td>
<td><%=c.getAddress()%></td>
<td><%=c.getUname()%></td>
<td><%=c.getPass()%></td>
<td><input type="submit" value="edit" onclick="editData()"></td>
<td><input type="submit" value="delete" onclick="deletData()"></td>
</tr>
<%} %>
</tbody>












</table>

 </form>
</body>
</html>
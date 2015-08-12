<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="assets/css/bootstrap.css" rel="stylesheet">
<title>Command List</title>
</head>
<body>

<table>
		<tr>
			<th>Product Id</th><th>Product Name</th><th>Product Price</th>
		</tr>
		<c:forEach items="${commandProducts}" var="commandProduct">
			<tr>
				<td>${commandProduct.id}</td><td>${commandProduct.name}</td><td>${commandProduct.price}</td>
			</tr>
		</c:forEach>
	</table>
	<a class="btn btn-primary" onClick='alert("Command create successfully")'>Checkout</a>

</body>
</html>
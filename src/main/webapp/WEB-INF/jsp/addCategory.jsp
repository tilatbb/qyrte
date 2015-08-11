<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Adaugare categorii</title>

<style>
	
	.error {
		color: #ff0000;
		
	}
	.errorblock {
		color: #000;
		background-color: #ffEEEE;
		border: 3px solid #ff0000;
		padding: 8px;
		margin 16px;
	}
	
</style>

</head>
<body>

	<form action="http://localhost:8080/lucru/addCategory" method="POST">
		<table>
				<tr>
					<td>nume categorie</td>
					<td><input name="nameCategory"/></td>
				
				</tr>
				<tr>
					<td colspan="3">
						<input type="submit" value="Adauga !"/>
					</td>
				</tr>
			</table>
	
	</form>


</body>
</html>
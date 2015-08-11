<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Adaugare subcategorii</title>

<script type="text/javascript" src="jquery-2.1.4.js"></script>

<script type="text/javascript">
	$(document).ready(
		function(){
			$.getJSON('http://localhost:8080/lucru/categories', {
				ajax: 'true'
			}, function(data){
				var html = '<option value="">--please select one--</option>';
				var len = data.length;
				for(var i = 0; i < len ; i++){
					html += '<option value="'+ data[i].id + '">'+ data[i].name +'</option>';
					
				}
				html += '</option>';
				
				$('#categoriess').html(html);
			});
		});
	

</script>

</head>
<body>
	<form action="http://localhost:8080/lucru/addSubcategory" method="post">
		<table>
			<tr>
				<td>nume categorie</td>
				<td><input name="nameSubcategory" value="" ></td>
				<td>
					<select name="categoryId" id="categoriess">
						
					</select>
				</td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="Adauga !"></td>
			</tr>
		</table>

	</form>
</body>
</html>
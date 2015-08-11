<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="jquery-2.1.4.js"></script>

<script type="text/javascript">
	$(document).ready(
		function(){
			$.getJSON('<spring:url value="categories.json"/>', {
				ajax: 'true'
			}, function(data){
				var html = '<option value="">--please select one--</option>';
				var len = data.length;
				for(var i = 0; i < len ; i++){
					html += '<option value="'+ data[i].name + '">'+ data[i].name +'</option>';
					
				}
				html += '</option>';
				
				$('#categories').html(html);
			});
		});
	

</script>
</head>
<body>
			
			 <form:select id="categories" path="categories" />

	
		<table>
		
		<tr>
			<th>ID</th>
			<th>Nume</th>
		</tr>
		
		<c:forEach items="${categories}" var="category">
			
			<tr>
			
				<td>${category.id}</td><td>${category.name}</td>
				
			
			</tr>
			
		</c:forEach>
		
	</table>
</body>
</html>
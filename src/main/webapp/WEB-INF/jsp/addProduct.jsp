<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Adaugare produse</title>

<script type="text/javascript" src="jquery-2.1.4.js"></script>

<script type="text/javascript">
	$(document).ready(
		function(){
			$.getJSON('<spring:url value="subcategories.json"/>', {
				ajax: 'true'
			}, function(data){
				var html = '<option value="">--please select one--</option>';
				var len = data.length;
				for(var i = 0; i < len ; i++){
					html += '<option value="'+ data[i].id + '">'+ data[i].name +'</option>';
					
				}
				html += '</option>';
				
				$('#subcategories').html(html);
			});
		});
	

</script>


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


<form:form commandName="product">
	<form:errors path="*" cssClass="errorblock" element="div"/>
	
	<table>
		<tr>
			<td>nume  :<form:input path="name" cssErrorClass="error"/></td>
			<td><form:errors path="name" cssClass="error"/></td>
			<td>pret  :<form:input path="price" cssErrorClass="error"/></td>
			<td><form:errors path="price" cssClass="error"/></td>
			<td>descriere  :<form:input path="description" cssErrorClass="error"/></td>
			<td><form:errors path="description" cssClass="error"/></td>
			<td>image url  :<form:input path="url" cssErrorClass="error"/></td>
			<td><form:errors path="url" cssClass="error"/></td>
			<td>
				<form:select id="subcategories" path="subcategoryId" />	    
			</td>
			
			
		</tr>
		<tr>
			<td colspan="5">
				<input type="submit" value="Adauga !"/>
			</td>
		</tr>
	</table>
</form:form>

</body>
</html>
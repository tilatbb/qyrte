<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
  <script data-require="angular.js@1.4.3" data-semver="1.4.3" src="https://code.angularjs.org/1.4.3/angular.js"></script>
    
<script type="text/javascript" src="jquery-2.1.4.js"></script>

<script type="text/javascript">
var MainController = function($scope){
	  
	  $scope.message = "aaaaaaaaaaaa";
	  
	};

</script>

</head>
<body>

 <body ng-controller="MainController">
    <h1>{{message}}</h1>
  </body>

</body>
</html>
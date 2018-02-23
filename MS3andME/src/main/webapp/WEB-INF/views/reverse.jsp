<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring Boot</title>
    
<!-- Static content -->
<link rel="stylesheet" href="/resources/css/style.css">
    
</head>
<body>
  
<table class="table">
    <tr>
        <th>Number Before Formatting</th>
        <th>Number After Formatting</th>
    </tr>
    <c:forEach items="${numClassListReverse}" var="dataItems">
    <tr>
        <td>${dataItems.getNumber()}</td>
        <td>${dataItems.stringRepresentationOfNo}</td>
    </tr>
    </c:forEach>
</table>

</body>
</html>
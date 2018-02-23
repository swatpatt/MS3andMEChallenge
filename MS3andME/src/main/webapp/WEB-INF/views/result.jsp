<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" session="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    
<!-- Static content -->
<link rel="stylesheet" href="/resources/css/style.css">
    
<title>Spring Boot</title>
</head>
<body class="body">
  <form action="reverse" method="post" >
      <table class="table">
          <tr>
            <th>Number Before Formatting</th>
            <th>Number After Formatting</th>
        </tr>
        <c:forEach items="${numClassList}" var="dataItems">
        <tr>
            <td>${dataItems.getNumber()}</td>
            <td>${dataItems.stringRepresentationOfNo}</td>
        </tr>
        </c:forEach>
        <tr>
            <td colspan="2"><input style="margin:auto;
    display:block; 
    font-size: 25px;" type="submit" value="Reverse"></td>
        </tr>
      </table>
      
  </form>


</body>
</html>
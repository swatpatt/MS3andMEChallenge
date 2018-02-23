<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Spring Boot</title>
    
<!-- Static content -->
<link rel="stylesheet" href="/resources/css/style.css"/>
    
<script type="text/javascript" src="/resources/js/app.js"></script>


</head>
<body class="body">
 
    <div class="form">
    <form action="result" method="post" onsubmit="return validate()">
      <table >
        <tr>
          <td colspan="2" style="background-color: #4CAF50; color: white;">Enter the range:</td>
        </tr>
        <tr>
            <td ><input type="number" id="min" name="min" min="1" max="200"></td>
            <td><input type="number" id="max" name="max" min="1" max="200"></td>
        </tr>
        <tr>
          <td colspan="2"><input style="margin:auto; display:block; font-size: 20px;" type="submit" value="Submit"></td>
        </tr>
          
      </table>
     </form>
  </div>

</body>
</html>
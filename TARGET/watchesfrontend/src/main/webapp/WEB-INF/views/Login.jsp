<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<div id="container">       
<form action="validate">
<table>
<tr>
<td><label for="username">Username:</label></td>
<td><input type="text" id="username" name="username"></td></tr>
<tr>
<td><label for="password">Password:</label></td>
<td><input type="password" id="password" name="password"></td></tr>
<!-- <div id="lower"> -->
<tr>
<td><input type="checkbox"><label for="checkbox">Keep me logged in</label></td>
<td><input type="submit" value="Login"></td>
<td><input type="reset" value="Cancel"/></td></tr>
<!-- </div>/ lower -->
</table>
</form>
</div>
</center>

</body>
</html>
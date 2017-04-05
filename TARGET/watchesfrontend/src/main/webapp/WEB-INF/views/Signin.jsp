<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign-in page</title>
</head>
<body bgcolor="skyblue">
<h3><u>Login</u></h3>
<form action="TestServlet" method="post" style="float:left">
Username<input type="text" name="userid"/>
Password<input type="password" name="pswrd"/><br><br>
<input type="button" onclick="check(this.form)" value="Login"/>
<input type="reset" value="Cancel"/>
</form>
</body>
</html>
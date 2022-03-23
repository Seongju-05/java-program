<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="bbb.AA" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String a = "hello";
	out.println("a = "+ a);
	int b = 10;
	AA a1 = new AA();
	a1.doA();
	String c = a1.doB();
	String d = a1.doC(c);
	out.println("d = "+ d);
%>
</body>
</html>
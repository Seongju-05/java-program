<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String a = request.getParameter("id");
	String b = request.getParameter("pw");
	
	out.println("a = "+a);
	out.println("b = "+b);
	
	if(a.equals("admin")) {
		out.println("로그인 성공!");
	}
	else {
		out.println("로그인 실패");
	}
	
%>
</body>
</html>
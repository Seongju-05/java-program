<%@page import="java.util.ArrayList"%>
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
	ArrayList<String> al = new ArrayList();
	al.add("홍길동");
	al.add("김길동");
	al.add("이길동");
	
	for(int i = 0; i < al.size(); i++) {
		out.println(al.get(i)+"<br>");
		}
	
	out.println("<hr>");
	
	for(String a : al) {
		out.println(a+"<br>");
	}
%>
</body>
</html>
<%@page import="servlet.model.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%  Member vo=(Member)application.getAttribute("vo");  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<ul>
<li><%= vo.getId() %>님 환영합니다.</li>
</ul>
</body>
</html>
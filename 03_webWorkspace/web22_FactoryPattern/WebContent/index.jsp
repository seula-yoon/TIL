<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
     #wrap{
        text-align: center;
        border: 2px dotted green;
     }
     </style>
</head>
<body>
<h1>CafeMember :: FrontControllerPattern + EL, JSTL </h1>
<div id="wrap">
     <a href="find.jsp">회원 검색 하기</a><p>
     <c:choose>
         <c:when test="${!empty vo }">
                 <a href="allmember.do">모든 회원 보기</a><p>
                 <a href=update.jsp>회원 정보 수정</a><p>
                 <a href="Logout.do">로그아웃</a><p>
             </c:when>
             <c:otherwise>
                 <a href="register.jsp">회원 가입 하기</a><p>
                 <a href="login.jsp">로그인 하기</a><p>
             </c:otherwise>
      </c:choose>
</div>                
</body>
</html>
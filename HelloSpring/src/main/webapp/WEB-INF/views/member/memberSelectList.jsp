<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>여기는 멤버 목록을 보여 주는 곳</p>

	<h1>${message }</h1>

	<c:forEach items="${members }" var="m">
		${m.id } : ${m.password } : ${m.name }<br />
	</c:forEach>
	<br />
	<a href="home.do">홈 가기</a>
</body>
</html>
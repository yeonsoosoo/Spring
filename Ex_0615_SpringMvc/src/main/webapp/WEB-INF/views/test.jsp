<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<p>IP : ${ip }</p>
	<ul>
	<c:forEach var="list" items="${list}">
		<li>${list}</li>
	</c:forEach>
	</ul>
</body>
</html>
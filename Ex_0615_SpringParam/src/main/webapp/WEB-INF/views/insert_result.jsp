<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p> 이름 : ${vo.name }</p>
	<p> 나이 : ${vo.age }</p>
	<p> 전화번호 : ${vo.tel }</p>
	
	<input type="button" value="돌아가기" onclick="location.href='insert_form.do'">
	<!-- Spring에서는 jsp파일에서 jsp파일로 이동하는 것이 불가능함.
		 그러므로 반드시 컨트롤러를 거쳐서 jsp로 전환을 해줘야한다.
	 -->
</body>
</html>
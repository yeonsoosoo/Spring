<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function send(f) {
		
		f.action="insert.do";
		f.method="post";
		f.submit();
	}
</script>
</head>
<body>
	<!-- post를 쓰는 이유는 get방식으로 보내면 파일에 대한 정보를 String으로 보내버림. 그럼 형변환을 할 수 있는 방법이 없으므로 post 사용 -->
	<form method="post" enctype="multipart/form-data">
		<table border="1" align="center">
			<caption>:::새글 작성하기:::</caption>
			<tr>
				<th>작성자</th>
				<td><input name="name"></td>
			</tr>
			
			<tr>
				<th>내용</th>
				<td><textarea row="5" cols="50" name="content" style="resize:none;" wrap="on"></textarea></td>
			</tr>
			
			<tr>
				<th>비밀번호</th>
				<td><input name="pwd" type="password"></td>
			</tr>
			
			<tr>
				<th>이미지 첨부</th>
				<td><input name="photo" type="file"></td>
			</tr>
			
			
			<tr>
				<td colspan="2" align="center">
					<input type="button" value="등록하기" onclick="send(this.form);">
					<input type="button" value="목록으로" onclick="location.href='list.do';">
				</td>
			</tr>
			
		</table>
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MVC 게시판</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>제목</td>
			<td>날짜</td>
		</tr>
		<!-- 데이터 쓰는 부분      c:forEach는 데이터가 있을 떄까지 반복하는 반복문-->
		<c:forEach items="${list }" var="dto">
			<tr>
				<td>${dto.bId }</td>
				<td>${dto.bName }</td>
				<td><a href="content_view.do?bId=${dto.bId }">${dto.bTitle}</a></td>
				<td>${dto.bDate }</td>
			</tr>
		</c:forEach>
		<tr>
		<td colspan = "5"><a href="write_view.do">글 작성</a></td>
		</tr>
	</table>

</body>
</html>
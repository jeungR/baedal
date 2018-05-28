<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>공급자 Home</title>
</head>
<body>
<form action = "*" method="post"> 

<p align=center><input type = "text" name = id readonly="readonly">사장님
<input type = "submit" value = "회원정보수정"></td>
<h3 align=center>주문현황</h3>
<table border="1" align=center>
<tr><td align=center>주문번호</td>
	<td align=center>고객이름</td>
	<td align=center>핸드폰</td>
	<td align=center>주소</td>
	<td align=center>메뉴</td>
	<td align=center>수량</td>
	<td align=center>확인</td>
</tr>
<tr><td>001</td>
	<td>선애</td>
	<td>010</td>
	<td>하남</td>
	<td>엽떡매운맛</td>
	<td>2</td>
	<td><input type = submit value = "거절">
		<input type = submit value = "확인"></td>
</tr>
</table><br>

<h3 align=center>메뉴정보</h3>
<table border="1" align=center>
<tr><td align=center>메뉴</td>
	<td align=center>가격</td>
	<td align=center>수정 및 삭제</td>
</tr>
<tr><td>엽떡매운맛</td>
	<td>20,000</td>
	<td><input type = submit value = "수정">
		<input type = submit value = "삭제"></td>
</tr>
</table><br>
<p align=center><input type=submit value='메뉴추가'>

</body>
</html>
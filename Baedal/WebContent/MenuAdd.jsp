<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% if(session.getAttribute("customerId") == null && session.getAttribute("ceoId") == null) 
	response.sendRedirect("Login.jsp"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>메뉴등록</title>
</head>
<body>
	<form action="MenuAdd_MenuInsert.do" method=post>
		<table>
			<tr>
				<td>메뉴이름</td>
				<td><input type=text name=menuname></td>
			</tr>
			<tr>
				<td>가격</td>
				<td><input type=text name=price></td>
			</tr>
			<tr>
				<td>카테고리</td>
				<td><select name="menucategory">
						<option>한식</option>
						<option>중식</option>
						<option>양식</option>
						<option>일식</option>
					</select></td>
			</tr>
			<tr>
				<td>예상소요시간</td>
				<td><input type=text name=cookingtime></td>
			</tr>
			<tr>
				<td><input type = "file" name = image accept = "image/gif,image/jpeg,image/png" value = "사진첨부"></td>
				<td><input type=submit value='확인'></td>
			</tr>
		</table>
	</form>
</body>
</html>
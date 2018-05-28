<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>메뉴등록</title>
</head>
<body>
	<form action="CEOHome.jsp" method=post>
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
						<option value="">카테고리선택</option>
						<option value="어쩌구">어쩌구</option>
						<option value="저쩌구">저쩌구</option>
				</select></td>
			</tr>
			<tr>
				<td>예상소요시간</td>
				<td><input type=text name=cookingtime></td>
			</tr>
			<tr>
				<td><input type=submit value='사진첨부'></td>
				<td><input type=submit value='확인'></td>
			</tr>
		</table>
	</form>
</body>
</html>
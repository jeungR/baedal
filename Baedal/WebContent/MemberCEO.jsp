<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>공급자 회원가입</title>
</head>
<body>

<form action = "*" method="post"> 

<Table>
<tr>	
<br><br>
	<td>ID : </td>
	<td><input type = text name = id size = 20 required></td>
	<td><input type = submit value = "중복확인"><br></td>
</tr>
<tr>
	<td>비밀번호 : </td>
	<td colspan="2"><input type = password name = password size = 20 required><br></td>
</tr>
<tr>
	<td>비밀번호 확인 : </td>
	<td colspan="2"><input type = password name = passwordcheck size = 20 required><br><br></td>
</tr>
<tr>
	<td colspan = "3"><hr><br></td>
	</tr>
	<tr>
	<td colspan = "3" align=center><h1>사업장 정보</h1></td>
	</tr>
<tr>
	<td>상호명 : </td>
	<td><input type = text name = restaurant size = 20 required></td>
	<td><input type = "submit" value = "사진첨부"><a href=""></a><br></td>
</tr>
<tr>
	<td> 업종 : </td>
	<td><select name = "category"> <!-- combobox 선택창 -->
			<option>한식</option>
			<option>중식</option>
			<option>양식</option>
			<option>일식</option>
		</select> <br></td>
</tr>
<tr>
	<td>주소 : </td>
	<td colspan="2"><input type = text name = Address size = 50 required><br></td>
</tr>
<tr>
	<td>전화번호 : </td>
	<td colspan="2"><input type = text name = Tel size = 20 required><br></td>
</tr>
<tr>
	<td colspan = "2"><input type = "checkbox" name = "agree" required> 정보이용에 동의합니다.(필수)</td>
	<td><input type = submit value = "확인"></td>
	</tr>
</Table>
</body>
</html>
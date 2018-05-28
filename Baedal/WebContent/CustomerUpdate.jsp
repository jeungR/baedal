<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>고객 회원정보수정</h3>
<table>
<tr>
	<td>이름</td>
	<td><input type = "text" name = "name" size="15"></td>
</tr>
<tr>
	<td>ID</td>
	<td><input type = "text" name = "id" size="15" readonly="readonly"></td>
</tr>
<tr>
	<td>PW</td>
	<td><input type = "password" name = "pw" size="15"></td>
</tr>
<tr>
	<td>PW확인</td>
	<td><input type = "password" name = "pwcheck" size="15"></td>
</tr>
<tr>
	<td>Mobile</td>
	<td><input type = "text" name = "mobile" size="25"></td>
</tr>
<tr>
	<td>주소</td>
	<td><input type = "text" name = "address" size = "50"></td>
</tr>

</table> <br>


<table>
<tr>
	<td colspan="180"></td><td><input type = "submit" value ="수정"></td>
</tr>	
</table>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% if(session.getAttribute("customerId") != null) response.sendRedirect("CustomerHome_RestaurantView.do"); %>
<% if(session.getAttribute("ceoId") != null) response.sendRedirect("CeoHome_OrderMenuView.do"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>고객 회원가입</h3>
<table>
<tr>
	<td>이름</td>
	<td><input type = "text" name = "name" size="15" required></td>
</tr>
<tr>
	<td>ID</td>
	<td><input type = "text" name = "id" size="15" required>
	<input type = "submit" value = "중복확인"></td>
</tr>
<tr>
	<td>PW</td>
	<td><input type = "password" name = "pw" size="15" required></td>
</tr>
<tr>
	<td>PW확인</td>
	<td><input type = "password" name = "pwcheck" size="15" required></td>
</tr>
<tr>
	<td>Mobile</td>
	<td><input type = "text" name = "mobile" size="25" required></td>
</tr>
<tr>
	<td>주소</td>
	<td><input type = "text" name = "address" size = "50" required></td>
</tr>

</table> <br>
	<input type="checkbox" name = "check" required>
	문자를 통한 정보수신에 동의 합니다. (필수)<br>

<table>
<tr>
	<td colspan="180"></td><td><a href="Login.jsp"><input type = "submit" value ="확인"></a></td>
</tr>	
</table>



</body>
</html>
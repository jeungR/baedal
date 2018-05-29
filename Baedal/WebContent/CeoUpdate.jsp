<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% if(session.getAttribute("customerId") == null && session.getAttribute("ceoId") == null) 
	response.sendRedirect("Login.jsp"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>공급자 회원정보 수정</title>
</head>
<body>

<form action = "MemberCeo_CeoUpdate.do" method="post" enctype="multipart/form-data"> 

<Table>
<tr>
<br><br>
	<td>ID : </td>
	<td colspan="2"><input type = text name = id size = 20 readonly="readonly"></td>
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
	<td><input type = text name = name size = 20 required></td>
</tr>
<tr>
	<td>메인사진 : </td>
	<td><input type = "file" name = image accept = "image/gif,image/jpeg,image/png" value = "사진첨부"><br></td>
</tr>
<tr>
	<td> 업종 : </td>
	<td><select name = "type"> <!-- combobox 선택창 -->
			<option>한식</option>
			<option>중식</option>
			<option>양식</option>
			<option>일식</option>
		</select> <br></td>
</tr>
<tr>
	<td>주소 : </td>
	<td colspan="2"><input type = text name = address size = 50 required><br></td>
</tr>
<tr>
	<td>전화번호 : </td>
	<td colspan="2"><input type = text name = phone size = 20 required><br></td>
</tr>
<tr>
	<td colspan = "2"></td>
	<td><input type = submit value = "수정"></td>
	</tr>
</Table>
</form>
</body>
</html>
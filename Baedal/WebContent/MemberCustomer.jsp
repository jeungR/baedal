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

<form action = "MemberCustomer_UserInsert.do" method="post" name="customerform" enctype="multipart/form-data"> 

<h3>고객 회원가입</h3>
<table>
<tr>
	<td>이름</td>
	<td><input type = "text" name = "name" size="15" required></td>
</tr>
<tr>
	<td>ID</td>
	<td><input type = "text" name = "id" size="15" required>
	<input type = button value = "중복확인" onclick="checkId(this.form)"></td>
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
	<td colspan="180"></td><td><input type = "submit" value ="확인"></td>
</tr>	
</table>
</form>

<script>
function checkId(){
	if(document.customerform.id.value == ""){
		alert("id를 입력하세요");
		return;
	}
	url = "MemberCustomer_IdCheck.do?id="+document.customerform.id.value;
	open(url, "ID 중복확인", "toolbar=no,location=no,status=no,menubar=no,scrollbars=no,width=300,height=200");
}
</script>



</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>공급자 회원가입 수정</title>
</head>
<body>

<form action = "CEOHome_Update.do" method="post" name="ceoform" enctype="multipart/form-data"> 

<Table>
<tr>
<br><br>
	<td>ID : </td>
	<td><input type = text name = id size = 20 value = "${CeoUpdateView.id}" required readonly="readonly"></td>
</tr>
<tr>
	<td>비밀번호 : </td>
	<td colspan="2"><input type = password name = password value = "${CeoUpdateView.password}" size = 20 required><br></td>
</tr>
<tr>
	<td>비밀번호 확인 : </td>
	<td colspan="2"><input type = password name = passwordcheck  size = 20 required><br><br></td>
</tr>
<tr>
	<td colspan = "3"><hr><br></td>
	</tr>
	<tr>
	<td colspan = "3" align=center><h1>사업장 정보</h1></td>
	</tr>
<tr>
	<td>상호명 : </td>
	<td><input type = text name = name size = 20 value = "${CeoUpdateView.name}" required></td>
</tr>
<tr>
	<td>메인사진 : </td>
	<td><input type = "file" name = image value = "${CeoUpdateView.image}" accept = "image/gif,image/jpeg,image/png" value = "사진첨부"><br></td>
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
	<td colspan="2"><input type = text name = address value = "${CeoUpdateView.address}" size = 50 required><br></td>
</tr>
<tr>
	<td>전화번호 : </td>
	<td colspan="2"><input type = text name = phone value = "${CeoUpdateView.phone}" size = 20 required><br></td>
</tr>
<tr>
	<td>배달팁 : </td>
	<td colspan="2"><input type= "number" value = "${CeoUpdateView.tip}" name = tip size = 20 required><br></td>
</tr>
<tr>

	<td><input type = submit value = "수정"></td>
	</tr>
</Table>
</form>
</body>

<script>
function checkId(){
	if(document.ceoform.id.value == ""){
		alert("id를 입력하세요");
		return;
	}
	url = "MemberCeo_IdCheck.do?id="+document.ceoform.id.value;
	open(url, "ID 중복확인", "toolbar=no,location=no,status=no,menubar=no,scrollbars=no,width=300,height=200");
}
</script>
</body>
</html>
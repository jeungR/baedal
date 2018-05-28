<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ID 중복확인</title>
</head>
<body>
	<c:if test="${hasSameId==true}">
		<h4>이미 사용 중인 ID 입니다.</h4>
	</c:if>
	<c:if test="${hasSameId==false}">
		<h4><c:out value="${param.id}"/>는 사용가능한 ID 입니다.</h4>
	</c:if>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ID �ߺ�Ȯ��</title>
</head>
<body>
	<c:if test="${hasSameId==true}">
		<h4>�̹� ��� ���� ID �Դϴ�.</h4>
	</c:if>
	<c:if test="${hasSameId==false}">
		<h4><c:out value="${param.id}"/>�� ��밡���� ID �Դϴ�.</h4>
	</c:if>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% if(session.getAttribute("customerId") == null || session.getAttribute("ceoId") == null) 
	response.sendRedirect("Login.jsp"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%@include file="/resources/module/menubar.jsp"%>

<h3>주문완료</h3>
주문이 완료되었습니다 ^________^
</body>
</html>
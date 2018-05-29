<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% if(session.getAttribute("customerId") == null && session.getAttribute("ceoId") == null) 
	response.sendRedirect("Login.jsp"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>고객 HOME</title>
<link rel="stylesheet" href="<%=application.getContextPath() %>/resources/css/imageGallary.css" />
</head>
<%@include file="/resources/module/menubar.jsp"%>

<div class="gallery">
  <a target="_blank" href="<%=application.getContextPath() %>/resources/image/chicken.jpg">
    <img src="<%=application.getContextPath() %>/resources/image/chicken.jpg" alt="chicken" width="300" height="200">
  </a>
  <div class="title">가게이름</div>
  <div class="desc">배달팁: 500원</div>
</div>





</body>
</html>
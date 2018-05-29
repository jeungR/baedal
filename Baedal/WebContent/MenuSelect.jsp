<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/resources/module/loginSession.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>메뉴 선택</title>
<link rel="stylesheet" href="<%=application.getContextPath() %>/resources/css/imageGallary.css" />
</head>
<%@include file="/resources/module/menubar.jsp"%>
<%
String imagepath = application.getContextPath() + "/resources/image/";
%>

		<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h1>주 메뉴</h1>

<div class="gallery">
  <c:forEach items= "${dto }" var="item">
  <a target="_blank" href="<%=imagepath %>${item.image}">
    <img src="<%=imagepath %>${item.image}" alt="${item.image}" width="300" height="200">
  </a>
  <div class="title">${item.name }</div>
  <div class="desc">${item.price }</div>
  </c:forEach>
</div>

<div style="clear:both;"></div>
<hr />

<h1>사이드</h1>
<div class="gallery">
  <a target="_blank" href="<%=application.getContextPath() %>/resources/image/chicken.jpg">
    <img src="<%=application.getContextPath() %>/resources/image/chicken.jpg" alt="chicken" width="300" height="200">
  </a>
  <div class="title">가게이름</div>
  <div class="desc">배달팁: 500원</div>
</div>



</body>
</html>
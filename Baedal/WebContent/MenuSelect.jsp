<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/resources/module/loginSession.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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


<h1>주 메뉴</h1>
<c:forEach items= "${mainMenuDTOs }" var="item">
<div class="gallery">
  <a href="MenuCheck_View.do?code=${item.code}">
    <img src="<%=imagepath %>${item.image}" alt="${item.image}" width="300" height="200">
  </a>
  <div class="title">${item.name }</div>
  <div class="desc">${item.price }</div>
</div>
</c:forEach>

<div style="clear:both;"></div>
<hr />

<h1>사이드</h1>
<c:forEach items= "${subMenuDTOs }" var="item">
<div class="gallery">
  <a href="MenuCheck_View.do?code=${item.code}">
    <img src="<%=imagepath %>${item.image}" alt="${item.image}" width="300" height="200">
  </a>
  <div class="title">${item.name }</div>
  <div class="desc">${item.price }</div>
</div>
</c:forEach>



</body>
</html>
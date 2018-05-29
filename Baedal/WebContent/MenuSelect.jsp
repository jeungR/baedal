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

<TABLE BORDER="1">
		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>제목</td>
			<td>날짜</td>
			<td>날짜</td>
			<td>날짜</td>
			<td>날짜</td>
			<td>날짜</td>
		</tr>
		<tr>
		<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
			<c:forEach items= "${MenuSelect }" var="dto">
				<tr>
					<td>${dto.code }</td>
					<td>${dto.name }</td>
					<td>${dto.price }</td>
					<td>${dto.date }</td>
					<td>${dto.image }</td>
					<td>${dto.type }</td>
					<td>${dto.restaurant_code }</td>
					<td>${dto.cookingtime }</td>
				</tr>
			</c:forEach>
	</TABLE>
















<h1>주 메뉴</h1>

<div class="gallery">
  <a target="_blank" href="<%=application.getContextPath() %>/resources/image/chicken.jpg">
    <img src="<%=application.getContextPath() %>/resources/image/chicken.jpg" alt="chicken" width="300" height="200">
  </a>
  <div class="title">가게이름</div>
  <div class="desc">배달팁: 500원</div>
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
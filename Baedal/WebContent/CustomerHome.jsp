<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/resources/module/loginSession.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>고객 HOME</title>
<link rel="stylesheet" href="<%=application.getContextPath() %>/resources/css/imageGallary.css" />
</head>
<%@include file="/resources/module/menubar.jsp"%>
<%
String imagepath = application.getContextPath() + "/resources/image/";
%>
	
<table>
<c:forEach items = "${list }" var = "item">
		<tr>
		<td>
		<div class="gallery">
 		 <a target="_blank" href="<%=imagepath %>/resources/image/${item.image}">
   		 <img src="<%=imagepath %>/resources/image/${item.image}" alt="chicken" width="300" height="200">
  		</a>
 		 <div class="title">${item.name}</div>
 		 <div class="desc">배달팁: "${item.tip}" 원</div>
		</div>
		</td>
		</tr>
</c:forEach>
		</table>
	




</body>
</html>
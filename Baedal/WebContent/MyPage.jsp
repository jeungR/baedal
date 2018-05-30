<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/resources/module/loginSession.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MyPage</title>
</head>
<%@include file="/resources/module/menubar.jsp"%>

<h3>주문 히스토리</h3>
<table border="1">
<tr align = "center"><td>주문번호</td>
	<td>상호명</td>
	<td>메뉴</td>
	<td>수량</td>
	<td>금액</td>
	<td>주문시간</td>
	<td>배달확인</td>
</tr>
	<c:forEach var="item" items="${HistorySearch }" >
<tr>
	<td>${item.order_code }</td>
	<td>${item.restaurtant_name }</td>
	<td>${item.food_name }</td>
	<td>${item.menu_number }</td>
	<td>${item.totalprice }</td>
	<td>${item.startdate }</td>
	<td>${item.ok }</td>
</tr>
</c:forEach>
</table><br>
<hr></hr>

<h3>개인정보</h3>
<table>
<tr><td>ID : </td><td><input type = "text" name = id value="${customerId}" readonly="readonly"></td><td><a href="CustomerUpdate_CustomerSelect.do"><input type = "submit" value = "회원정보수정"></a></td>
</tr>
<tr><td>등급 : </td><td><input type = "text" name = vip value="${MyPage.vip }" readonly="readonly"></td>
</tr>
</table>
</body>
</html>
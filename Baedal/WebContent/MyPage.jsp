<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/resources/module/loginSession.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
<!-- 데이터 쓰는 부분      c:forEach는 데이터가 있을 떄까지 반복하는 반복문-->
<tr>
	<td>001</td>
	<td>엽떡</td>
	<td>엽떡순한맛</td>
	<td>1</td>
	<td>14,000</td>
	<td>2018-05-28</td>
	<td>배달완료</td>
</tr>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<c:forEach items="${HistorySearch }" var="dto">
<tr>
	<td>${dto.order_code }</td>
	<td>${dto.restaurtant_name }</td>
	<td>${dto.food_name }</td>
	<td>${dto.menu_number }</td>
	<td>${dto.totalprice }</td>
	<td>${dto.startdate }</td>
	<td>${dto.ok }</td>
</tr>
</c:forEach>
</table><br>
<hr></hr>

<h3>개인정보</h3>
<table>
<tr><td>ID : </td><td><input type = "text" name = id value="${customerId}" readonly="readonly"></td><td><a href="CustomerUpdate.jsp"><input type = "submit" value = "회원정보수정"></a></td>
</tr>
<tr><td>등급 : </td><td><input type = "text" name = vip value="${vip}" readonly="readonly"></td>
</tr>
</table>
</body>
</html>
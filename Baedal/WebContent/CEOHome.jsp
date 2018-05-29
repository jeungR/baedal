<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/resources/module/loginSession.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>공급자 Home</title>
</head>
<%@include file="/resources/module/menubarCeo.jsp"%>


<form action = "CeoUpdate.jsp" method="post"> 
<p> ${ceoId} 사장님 
<input type = "submit" value = "회원정보수정" /></p>
</form>
<h3>주문현황</h3>
<table border="1">
<tr><th>주문번호</th>
	<th>고객이름</th>
	<th>핸드폰</th>
	<th>주소</th>
	<th>메뉴</th>
	<th>수량</th>
	<th>확인</th>
</tr>
<c:forEach var="item" items="${orderReportDTOs}">
    <tr>
    <td>${item.order_code}</td>
    <td>${item.customer_name}</td>
    <td>${item.customer_mobile}</td>
    <td>${item.customer_address}</td>
    <td>${item.food_name}</td>
    <td>${item.menu_number}</td>
    <c:if test="${item.order_ok eq 0}">
    <td><input type="button" value="거절" onclick="location.href='CEOHome_OrderOk.do?code=${item.order_code}&ok=9'"/>
    	<input type="button" value="확인" onclick="location.href='CEOHome_OrderOk.do?code=${item.order_code}&ok=1'"/>
    </td>
    </c:if>
    <c:if test="${item.order_ok eq 1}">
    <td>주문처리완료</td>
    </c:if>
    </tr>
</c:forEach>
</table><br>

<h3>메뉴정보</h3>
<table border="1">
<tr><th>메뉴</th>
	<th>가격</th>
	<th>수정</th>
</tr>
<c:forEach var="item" items="${foodDTOs}">
    <tr>
    <td>${item.name}</td>
    <td>${item.price}</td>
    <td><input type="button" value="삭제" onclick="location.href='CEOHome_MenuInfoDelete.do?code=${item.code}'"/></td>
    </tr>
</c:forEach>
</table><br>
<form action = "MenuAdd.jsp" method="post">
<p>
<input type=submit value='메뉴추가'>
</p>
</form>

</body>
</html>
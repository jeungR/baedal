<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/resources/module/loginSession.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>공급자 Home</title>
<style type="text/css">
table.ex1 {width:98%; margin:0 auto; text-align:right; border-collapse:collapse}
.ex1 th, .ex1 td {padding:5px 10px}
.ex1 caption {font-weight:700; font-size:20px; padding:5px; color:#1BA6B2; text-align:left; margin-bottom:5px}
.ex1 thead th {background:#ABC668; color:#fff; text-align:center; border-right:1px solid #fff}
.ex1 tbody th {text-align:left; width:12%}
.ex1 tbody td.date1 {text-align:center; width:8%}
.ex1 tbody td.desc {text-align:left; width:35%}
.ex1 tbody tr.odd {background:#f9f9f9}
.ex1 tbody tr.odd th {background:#f2f2f2}
.ex1 tbody tr:hover {background:#F3F5BB}
.ex1 tbody tr:hover th {background:#F2F684; color:#1BA6B2}
.ex1 tfoot tr {border-top:6px solid #E9F7F6; color:#1BA6B2}
.ex1 tfoot th {text-align:left; padding-left:10px}
.button {
    background-color: #4CAF50; /* Green */
    border: none;
    color: white;
    padding: 10px 15px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 13px;
    margin: 4px 2px;
    -webkit-transition-duration: 0.4s; /* Safari */
    transition-duration: 0.4s;
    cursor: pointer;
}

.button1 {
    background-color: white; 
    color: black; 
    border: 2px solid #4CAF50;
}

.button1:hover {
    background-color: #4CAF50;
    color: white;
}
</style>
</head>
<%@include file="/resources/module/menubarCeo.jsp"%>


<form action = "CEOHome_UpdateView.do" method="post"> 
<p> ${ceoId} 사장님 
<input type = "submit" value = "회원정보수정" class = "button button1"/></p>
</form>
<h3>주문현황</h3>
<table cellspacing='0' class = "ex1">
<thead>
<tr><th>주문번호</th>
	<th>고객이름</th>
	<th>핸드폰</th>
	<th>주소</th>
	<th>메뉴</th>
	<th>수량</th>
	<th>확인</th>
</tr>
</thead>
<c:forEach var="item" items="${orderReportDTOs}">
    <tr>
    <td>${item.order_code}</td>
    <td>${item.customer_name}</td>
    <td>${item.customer_mobile}</td>
    <td>${item.customer_address}</td>
    <td>${item.food_name}</td>
    <td>${item.menu_number}</td>
    <c:if test="${item.order_ok eq 0}">
    <td><input type="button" value="거절" class = "button button1" onclick="location.href='CEOHome_OrderOk.do?code=${item.order_code}&ok=9'"/>
    	<input type="button" value="확인" class = "button button1" onclick="location.href='CEOHome_OrderOk.do?code=${item.order_code}&ok=1'"/>
    </td>
    </c:if>
    <c:if test="${item.order_ok eq 1}">
    <td>주문처리완료</td>
    </c:if>
    </tr>
</c:forEach>
</table><br>

<h3>메뉴정보</h3>
<table cellspacing='0' class = "ex1">
<thead>
<tr><th>메뉴</th>
	<th>가격</th>
	<th>수정</th>
</tr>
</thead>
<c:forEach var="item" items="${foodDTOs}">
    <tr align = center>
    <td>${item.name}</td>
    <td>${item.price}</td>
    <td><input type="button" value="삭제"  class = "button button1"  onclick="location.href='CEOHome_MenuInfoDelete.do?code=${item.code}'"/></td>
    </tr>
</c:forEach>
</table><br>
<form action = "MenuAdd.jsp" method="post">
<p>
<input type=submit value='메뉴추가' class = "button button1" >
</p>
</form>

</body>
</html>
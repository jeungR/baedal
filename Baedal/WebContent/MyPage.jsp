<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/resources/module/loginSession.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MyPage</title>
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
<%@include file="/resources/module/menubar.jsp"%>

<h3 align = "center">주문 히스토리</h3>
<table cellspacing='0' class = "ex1">
<thead>
<tr align = "center"><th>주문번호</th>
	<th>상호명</th>
	<th>메뉴</th>
	<th>수량</th>
	<th>금액</th>
	<th>주문시간</th>
	<th>배달확인</th>
</tr>
</thead>
	<c:forEach var="item" items="${HistorySearch }" >
<tr>
	<td align = "center">${item.order_code }</td>
	<td align = "center">${item.restaurtant_name }</td>
	<td align = "center">${item.food_name }</td>
	<td align = "center">${item.menu_number }</td>
	<td align = "center">${item.totalprice }</td>
	<td align = "center">${item.startdate }</td>
	<td align = "center">${item.ok }</td>
</tr>
</c:forEach>
</table><br>
<hr></hr>

<h3 align = "center">개인정보</h3>
<table align = "center">
<tr><td>ID : </td><td><input type = "text" name = id value="${customerId}" readonly="readonly"></td><td><a href="CustomerUpdate_CustomerSelect.do"><input type = "submit" value = "회원정보수정" class = "button button1"></a></td>
</tr>
<tr><td>등급 : </td><td><input type = "text" name = vip value="${MyPage.vip }" readonly="readonly"></td>
</tr>
</table>
</body>
</html>
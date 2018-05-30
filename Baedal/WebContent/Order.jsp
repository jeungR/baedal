<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/resources/module/loginSession.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>주문하기 창</title>
</head>
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

	<form action="OrderFinish" method=post>
		<h2 align="center">장바구니(주문내역)</h2>
		<table cellspacing='0' id="itemtable" class = ex1>
			<thead>
			<tr>
				<th align=center>메뉴</th>
				<th align=center>수량</th>
				<th align=center>금액</th>
				<th align=center>취소</th>
			</tr>
			</thead>
				<c:forEach var="item" items="${BasketSearch }" >
			<tr>
				<td align = "center">${item.food_name }</td>
				<td align = "center">${item.basket_number }</td>
				<td align = "center">${item.food_price }</td>
				<td align=center><input type="button" value='취소' class = "button button1" onclick="location.href='Order_BasketDelete.do?code=${item.code}'"/></td>
			</tr>
				</c:forEach>
		</table>
		<br>
			</form>
			
			<form action = "MenuSelect.jsp" method="post">
		<table  align = "center">
			<tr>
				<td><input type=submit value='메뉴추가' class = "button button1"></td>
				<td>총 금액 : <input type=text name=total1 id="totalprice" size=20></td>
			</tr>
		</table>
				
		<br>
		<table align = "center">
			<tr>
				<td>Mobile</td>
				<td><input type=text name=mobile value="${Order.mobile}" size=20></td>
			</tr>
			<tr>
				<td>주소</td>
				<td><input type=text name=address value="${Order.address}" size=40></td>
			</tr>
			<tr>
				<td>결제방법</td>
				<td><input type="radio" name="fruit" value="app" /> 앱에서 결제 <input
					type="radio" name="fruit" value="man" /> 만나서 결제</td>
			</tr>
		</table>
		<table align = "center">
		<tr>
		<td><input type="checkbox" name="chk" value="chk"> 구매조건 확인 및 결제진행 동의 (필수)</td></tr>
		</table>
		<table align = "center">
			<tr>
				<td colspan=2>+ 배달팁: <input type=text name=tip id="tip" size=5 value="${tip}">
					원
				</td>
			</tr>
			
			</table>
			</form>
			
			<form action = "Order_OrderInsert.do" method="post">
			<table align = "center">
			<tr>
				<td>총 금액 : <input type=text name=total2 id="tiptotalprice" size=20></td>
				<td><input type=submit value='주문하기' class = "button button1"></td>
			</tr>
		</table>
		</form>




</body>
<script>
function calculate() {
    var table = document.getElementById("itemtable");
    var sumVal = 0;
    var tip = document.getElementById("tip").value;
    
    for(var i = 1; i<table.rows.length; i++){
    	sumVal = sumVal + parseInt(table.rows[i].cells[2].innerHTML);
    }
    
    document.getElementById("totalprice").value = sumVal;
    document.getElementById("tiptotalprice").value = sumVal+parseInt(tip);
    
}
calculate();
</script>

</html>
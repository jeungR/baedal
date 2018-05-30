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
<%@include file="/resources/module/menubar.jsp"%>

	<form action="OrderFinish" method=post>
		<h2>장바구니(주문내역)</h2>
		<table border=1 id="itemtable">
			<tr>
				<td align=center>메뉴</td>
				<td align=center>수량</td>
				<td align=center>금액</td>
				<td align=center>취소</td>
			</tr>
				<c:forEach var="item" items="${BasketSearch }" >
			<tr>
				<td>${item.food_name }</td>
				<td>${item.basket_number }</td>
				<td>${item.food_price }</td>
				<td align=center><input type="button" value='취소' onclick="location.href='Order_BasketDelete.do?code=${item.code}'"/></td>
			</tr>
				</c:forEach>
		</table>
		<br>
			</form>
			
			<form action = "MenuSelect.jsp" method="post">
		<table>
			<tr>
				<td><input type=submit value='메뉴추가'></td>
				<td>총 금액 : <input type=text name=total1 id="totalprice" size=20></td>
			</tr>
		</table>
				
		<br>
		<table>
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
		<br> <input type="checkbox" name="chk" value="chk"> 구매조건
		확인 및 결제진행 동의 (필수) <br> <br>
		<table>
			<tr>
				<td colspan=2>+ 배달팁: <input type=text name=tip id="tip" size=5 value="${tip}">
					원
				</td>
			</tr>
			
			</table>
			</form>
			
			<form action = "Order_OrderInsert.do" method="post">
			<table>
			<tr>
				<td>총 금액 : <input type=text name=total2 id="tiptotalprice" size=20></td>
				<td><input type=submit value='주문하기'></td>
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
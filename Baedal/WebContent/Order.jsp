<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="" method=post>
		<h2>장바구니(주문내역)</h2>
		<table border=1>
			<tr>
				<td align=center>메뉴</td>
				<td align=center>수량</td>
				<td align=center>금액</td>
				<td align=center>취소</td>
			</tr>
			<tr>
				<td>치킨</td>
				<td>2</td>
				<td>31000</td>
				<td align=center><input type=submit value='취소'></td>
			</tr>
		</table>
		<br>
		<table>
			<tr>
				<td><input type=submit value='메뉴추가'></td>
				<td>총 금액 : <input type=text name=total1 size=5></td>
			</tr>
		</table>
		<br>
		<table>
			<tr>
				<td>Mobile</td>
				<td><input type=text name=mobile size=20></td>
			</tr>
			<tr>
				<td>주소</td>
				<td><input type=text name=address size=40></td>
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
				<td colspan=2>+ 배달팁: <input type=text name=tip size=5>
					원
				</td>
			</tr>
			<tr>
				<td>총 금액 : <input type=text name=total2 size=5></td>
				<td><input type=submit value='주문하기'></td>
			</tr>
		</table>


	</form>

</body>
</html>
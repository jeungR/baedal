<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인 페이지</title>
</head>
<body>
	<form action="" method=post>
		<table border="1">
			<tr>
				<td><input type="radio" name="login" value="customer">고객</td>
				<td><input type="radio" name="login" value="ceo">공급자</td>
			</tr>
			<tr>
				<td align=center><h3>ID</h3></td>
				<td><h3>
						<input type="text" name="id" required>
					</h3></td>
			</tr>
			<tr>
				<td><h3>Password</h3></td>
				<td><h3>
						<input type="password" name="password" required>
					</h3></td>
			</tr>
			<tr>
				<td align=center><input type=submit value='회원가입'></td>
				<td align=right><input type=submit value='확인'></td>
			</tr>

		</table>

	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录</title>
<style type="text/css">
	*{
		margin: 0px;
		padding: 0px;
	}
</style>
</head>
<body>
	<center style="position: absolute;top: 50%;left: 50%;height: 30%;width: 50%;margin: -15% 0 0 -25%;">
		<div>
			<div style="border: solid 1px;">
				<center>
					<h1>
						<br>
						用户登录
						<br>
						<br>
					</h1>
				</center>
				<center>
					<form action="${pageContext.request.contextPath}/login.action" method="post">
						<center>
						<br>
							用户名:<input type="text" name="username">
						<br>
						<br>
						</center>
						<center>
						<br>
							密&nbsp;码:<input type="password" name="userpassword">
						<br>
						<br>
						</center>
						<center>
						<br>
							<input style="width: 50%;height: 30px" type="reset" name="重置">
							<br>
							<br>
							<input style="width: 50%;height: 30px" type="submit" name="提交">
						<br>
						<br>
						</center>
					</form>
				</center>
			</div>
		</div>
	</center>
</body>
</html>
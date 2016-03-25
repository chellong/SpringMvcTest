<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>itemsList.jsp</title>

<style type="text/css">
 .table {
	margin-left: auto;
	margin-right: auto;
	border: 1px solid black;
	line-height: 1.25;
	width: 90%;
	text-align: center;
	border-spacing: 0px 1px;
	border-collapse: collapse;
	table-layout: fixed;
}

 .table th{
	border: 1px solid black;
	line-height: 1;
	padding: 7px;
	background-color: #dddddd;
	text-align: center;
}

 .table td{
	border: 1px solid black;
	padding: 5px;
}
</style>
</head>
<body>
	<center>
		<c:forEach items="${allErrors}" var="error">
			${error.defaultMessage}
		</c:forEach>
		<form
			action="${pageContext.request.contextPath}/items/editItemsSumbit.action"
			method="post">

			<input type="hidden" name="id" value="${itemsCustom.id}">
			修改商品信息
			<table class="table" width="100%" border="1">
				<tr>
					<td>商品名称</td>
					<td><input type="text" name="name" value="${itemsCustom.name}" /></td>
				</tr>

				<tr>
					<td>商品价格</td>
					<td><input type="text" name="price"
						value="${itemsCustom.price}" /></td>
				</tr>

				<tr>
					<td>生产日期</td>
					<td><input type="text" name="createtime"
						value="<fmt:formatDate value="${itemsCustom.createtime}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate>" /></td>
				</tr>

				<tr>
					<td>商品简介</td>
					<td><textarea rows="3" cols="30" name="detail">
							${itemsCustom.detail}
						</textarea></td>
				</tr>

				<tr>
					<td colspan="2" align="center"><input type="submit" value="提交">
					</td>
				</tr>

			</table>
		</form>
	</center>
</body>
</html>
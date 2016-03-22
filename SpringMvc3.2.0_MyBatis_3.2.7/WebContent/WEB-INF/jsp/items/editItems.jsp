<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>itemsList.jsp</title>
	</head>
<body>
	<form action="${pageContext.request.contextPath}/items/editItemsSumbit.action" id="itemForm" method="post" enctype="multipart/form-data">
		<input type="hidden" name="id" value="${itemsCustom.id}">
		修改商品信息
		<table>
			<tr>
				<td>商品名称</td>
				<td><input type="text" name="name" value="${itemsCustom.name}"/></td>
			</tr>
			
			<tr>
				<td>商品价格</td>
				<td><input type="text" name="price" value="${itemsCustom.price}"/></td>
			</tr>
			
			<tr>
				<td>商品简介</td>
				<td>
					<textarea rows="3" cols="30" name="detail">
						${itemsCustom.detail}
					</textarea>
				</td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="提交">
				</td>
			</tr>
		
		</table>
	</form>
</body>
</html>
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
	
	*{
		margin: 0px;
		padding: 0px;
	}
	.table {
		margin-left: auto;
		margin-right: auto;
		border: 1px solid black;
		line-height: 1.25;
		width: 50%;
		text-align: center;
		border-spacing: 0px 1px;
		border-collapse: collapse;
		table-layout: fixed;
	}
	
	.table th {
		border: 1px solid black;
		line-height: 1;
		padding: 7px;
		background-color: #dddddd;
		text-align: center;
	}
	
	.table td {
		border: 1px solid black;
		padding: 5px;
	}
	
	.div_center {
			 border-style:solid;
			 border-width:1px;
		}
</style>
</head>
<body>
	<div class="div_center">
		<c:forEach items="${allErrors}" var="error">
			${error.defaultMessage}
		</c:forEach>
		<form
			action="${pageContext.request.contextPath}/items/editItemsSumbit.action"
			method="post" enctype="multipart/form-data">
			<input type="hidden" name="id" value="${itemsCustom.id}"> <br />
			<center>修改商品信息</center>
			<br />
			<table class="table">
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
					<td>商品图片</td>
					<td><c:if test="${itemsCustom.pic} != null">
							<img src="/pic/${itemsCustom.pic}" width="100" height="100">
						</c:if> <input type="file" name="item_pic"></td>
				</tr>

				<tr>
					<td>商品简介</td>
					<td><textarea rows="3" cols="30" name="detail">
							${itemsCustom.detail}
						</textarea></td>
				</tr>

				<tr>
					<td colspan="2" align="center"><input style="width:100px" type="submit" value="提交">
					</td>
				</tr>

			</table>
		</form>
		<br/>
		<br/>
	</div>
</body>
</html>
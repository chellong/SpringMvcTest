<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">
	
	*{
		margin: 0px;
		padding: 0px;
	}
	table.gridtable {
		font-family: verdana,arial,sans-serif;
		font-size:11px;
		color:#333333;
		border-width: 1px;
		border-color: #666666;
		border-collapse: collapse;
	}
	table.gridtable th {
		border-width: 1px;
		padding: 8px;
		border-style: solid;
		border-color: #666666;
		background-color: #dedede;
	}
	table.gridtable td {
		border-width: 1px;
		padding: 8px;
		border-style: solid;
		border-color: #666666;
		background-color: #ffffff;
	}
	
	input {
		 padding: 0px;
		 margin: 0px;
		 width: 100%;
		 height:100%;
		 border: 0;
	}
	
	.div_center{
		 border: blue 1px;
	}
</style>

<script type="text/javascript">
	function deleteItems() {
		//提交
		document.itemsForm.action = "${pageContext.request.contextPath}/items/deleteItems.action";
		document.itemsForm.submit();
	}

	function queryItems() {
		//提交
		document.itemsForm.action = "${pageContext.request.contextPath}/items/queryItems.action";
		document.itemsForm.submit();
	}
</script>
</head>
<body>
<div class="div_center">
	<form name="itemsForm"
		method="post">
		查询条件：<br />
		<table width="100%" class="gridtable">
			<tr>
				<td><input type="text" name="itemsCustom.name" /></td>
				<td><input type="button" value="提交" onclick="queryItems()" /></td>
				<td><input type="button" value="批量删除" onclick="deleteItems()" /></td>
			</tr>
		</table>
		商品列表：<br />
		<table width="100%" class="gridtable">

			<tr>
				<td>选择</td>
				<td>商品名称</td>
				<td>商品价格</td>
				<td>生产日期</td>
				<td>商品描述</td>
				<td>操作</td>
			</tr>
			<c:forEach items="${itemsList}" var="item">
				<tr>
					<td><input type="checkbox" name="itemsId" value="${item.id}"></td>
					<td>${item.name}</td>
					<td>${item.price}</td>
					<td><fmt:formatDate value="${item.createtime}"
							pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate></td>
					<td>${item.detail}</td>
					<td><a
						href="${pageContext.request.contextPath}/items/editItems.action?id=${item.id}">修改</a></td>
				</tr>
			</c:forEach>
		</table>

	</form>
</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

<script type="text/javascript">
	function editItemsQuery() {
		//提交
		document.itemsForm.action = "${pageContext.request.contextPath}/items/editItemsAllSubmit.action";
		document.itemsForm.submit();
	}
</script>

<style type="text/css">
	* {
		margin: 0px;
		padding: 0px;
	}
	
	table.gridtable {
		font-family: verdana, arial, sans-serif;
		font-size: 11px;
		color: #333333;
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
/* 		width: 120px; */
		width:100%;
		height: 30px;
		border: 0;
	}
	
	.input_x{
		padding: 0px;
		margin: 0px;
		width: 120px;
		height: 40px;
		border: 0;
	}
	
	select option {
		padding: 0px;
		margin: 0px;
		width: 100%;
		height: 100%;
		border: 0;
	}
	
	.div_center {
		border-style: solid;
		border-width: 1px;
	}
</style>
</head>
<body>
	<div class="div_center">
		<center>
			<br/>
			<br/>
			<h1>商品列表:</h1>
			<br/>
			<br/>
		</center>
		<form name="itemsForm"
			action="${pageContext.request.contextPath}/items/queryItems.action"
			method="post">
			<table width="100%" class="gridtable">
				<tr>
					<td>商品编号</td>
					<td>商品名称</td>
					<td>商品价格</td>
					<td>生产日期</td>
					<td>商品描述</td>
				</tr>
				<c:forEach items="${itemsList}" var="item" varStatus="status">
					<tr>
						<td >${item.id}</td>
						<td><input name="itemsList[${status.index}].name"
							value="${item.name}"></td>
						<td><input name="itemsList[${status.index}].price"
							value="${item.price}"></td>
						<td><input name="itemsList[${status.index}].createtime"
							value="<fmt:formatDate value="${item.createtime}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate>"></td>
						<td><input name="itemsList[${status.index}].detail"
							value="${item.detail}"></td>
					</tr>
				</c:forEach>
			</table>
			<center>
				<br/>
				<br/> 
				<br/>
				<input class="input_x" type="button" value="批量修改" onclick="editItemsQuery()" />
				<br/>
				<br/> 
				<br/>
			</center>
		</form>
	</div>
</body>
</html>
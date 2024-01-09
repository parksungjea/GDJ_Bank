<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../temps/bootst_head.jsp"></c:import>
</head>
<body>
<c:import url="../temps/bootst_css.jsp"></c:import>
	<table class="table table-hover">
		<tr>
			<td>NUM</td> <td>name</td> <td>CONTENTS</td> <td>RATE</td> <td>JUMSU</td>
		</tr>
		<tr>
		<td>${detail.productNum}</td>
		<td>${detail.productName}</td>
		<td>${detail.productContents}</td>
		<td>${detail.productRate}</td>
		<td>${detail.productJumsu}</td>
		</tr>
	</table>
	<c:import url="../temps/bootst_js.jsp"></c:import>
</body>
</html>
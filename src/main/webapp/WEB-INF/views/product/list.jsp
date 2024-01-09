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
<h1>안녕</h1>
<c:import url="../temps/bootst_css.jsp"></c:import>
<table class="table table-hover">
<tr>
	<td>NUM</td> <td>name</td> <td>CONTENTS</td> <td>RATE</td> <td>JUMSU</td>
</tr>
<c:forEach items="${requestScope.list}" var="dto">
<tr>
<td>${pageScope.dto.productNum}</td>
<td><a href="./detail?productNum=${dto.productNum}">${pageScope.dto.productName}</a></td>
<td>${pageScope.dto.productContents}</td>
<td>${pageScope.dto.productRate}</td>
<td>${pageScope.dto.productJumsu}</td>
</tr>
</c:forEach>


</table>
<button>Add</button>

<c:import url="../temps/bootst_js.jsp"></c:import>
</body>
</html>
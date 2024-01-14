<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Personal - Start Bootstrap Theme</title>
       
        <!-- Favicon-->
	<!-- 사용전 경로를 꼭 수정하세요 ~~ -->
	<c:import url="../temps/head_css.jsp"></c:import>
    </head>
    <body class="d-flex flex-column h-100">
        <main class="flex-shrink-0">
            <!-- Navigation-->
			<!-- 사용전 경로를 꼭 수정하세요 ~~ -->
			<c:import url="../temps/header.jsp"></c:import>
			
			<div class="flex-shrink-0">
				<div class="text-center mb-5">
						<h1 class="display-5 fw-bolder mb-0"><span class="text-gradient d-inline">product List</span></h1>
				</div>
				
				<table>
				<c:forEach items="${list}" var="dto">
				<tr>
					<td>${dto.productNum}</td>
					<td><a href="./detail?productNum=${dto.productNum}">${dto.productName}</a></td>
					<td>${dto.productContents}</td>
					<td>${dto.productRate}</td>
					<td>${dto.productJumsu}</td>
									
				</tr>
				</c:forEach>
				
				</table>
				<div>
					<a href="./add">상품등록</a>
				</div>
			</div>

        </main>
	
	<!-- Footer -->
	<!-- 사용전 경로를 꼭 수정하세요 ~~ -->
	<c:import url="../temps/footer.jsp"></c:import>
    </body>
</html>
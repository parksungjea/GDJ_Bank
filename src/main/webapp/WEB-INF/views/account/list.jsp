<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
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
		<section>
			<div class="text-center mb-5">
				<h1 class="display-5 fw-bolder mb-0">
					<span class="text-gradient d-inline">${board}List</span>
				</h1>
			</div>
			<div class="row gx-5 justify-content-center">
				<div class="col-lg-11 col-xl-9 col-xxl-8">
					<!-- table -->
					<div>
						<table class="table table-hover">
							<thead>
								<!-- 
								상품명
					    	 계좌
					    	 잔약
					    	 이자율
					    	 가입일
    	  -->
								<tr class="table-dark">
									<th>상품명</th>
									<th>계좌</th>
									<th>잔액</th>
									<th>이자율</th>
									<th>가입일</th>
								</tr>
								
								<c:forEach items="${list}" var="dto">
								<tr>
								<td>${dto.productName}</td>
								<td>${dto.productRate}</td>
								<c:forEach items="${dto.accountDTOs}"  var="dtoo">							
								<td>${dtoo.accountNum}</td>
								<td>${dtoo.accountBalance}</td>
								<td>${dtoo.accountDate}</td>
								</c:forEach>
								</tr>
								</c:forEach>
							</thead>
						</table>
					</div>
				</div>
			</div>
		</section>

	</main>

	<!-- Footer -->
	<!-- 사용전 경로를 꼭 수정하세요 ~~ -->
	<c:import url="../temps/footer.jsp"></c:import>
</body>
</html>
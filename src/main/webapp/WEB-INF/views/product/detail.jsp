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
								<tr class="table-dark">
									<th>ProductNum</th>
									<th>ProductName</th>
									<th>productContents</th>
									<th>ProductRate</th>
									<th>ProductJumsu</th>
								</tr>



								<tr class="table-dark">
									<th>${detail.productNum}</th>
									<th>${detail.productName}</th>
									<th>${detail.productContents}</th>
									<th>${detail.productRate}</th>
									<th>${detail.productJumsu}</th>
								</tr>
							</thead>
						</table>
						<input id="inp" type="hidden" value="${detail.productNum}">
						
					</div>
				</div>
			</div>
		</section>


		<button id="bts">찜콩하기</button>
		<a href="../account/add?productNum=${detail.productNum}">상품 가입하기</a><br><br>
		<a href="./update?productNum=${detail.productNum}">수정하기</a>
	</main>

	<!-- Footer -->
	<!-- 사용전 경로를 꼭 수정하세요 ~~ -->
	<c:import url="../temps/footer.jsp"></c:import>
	<script type="text/javascript" src="../../../resources/js/product/wishlist.js"></script>
</body>
</html>

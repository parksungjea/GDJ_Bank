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

	</main>


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

					<div class="container">
						<div>
							<button id="del">삭제하기</button>
						</div>
					</div>

					<table class="table table-hover">
						<thead>

							<tr class="table-dark">
								<th><input type="checkbox" id="checks">AllCheck</th>
								<th>ProductNum</th>
								<th>ProductName</th>
								<th>ProductRate</th>
							</tr>
						</thead>
						<tbody id="tjsp">
							<c:forEach items="${list}" var="dto">
								<tr>
									<td><input type="checkbox" class="check" name="check"
										value="${dto.productNum }"></td>
									<td>${dto.productNum}</td>
									<td>${dto.productName}</td>
									<td>${dto.productRate}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>

					<!-- pager!@#!@#!@#!@$@#!$!#@%@#$%$#@@5 -->
					<nav aria-label="Page navigation example">
						<ul class="pagination">
							<!-- @@@@@@@@@@@@@@@@@@@@@@@@ -->
							<li class="page-item"><a class="page-link" href="#">Previous</a></li>


							<!-- @@@@@@@@@@@@@@@@@@@@@@@@ -->
							<li class="page-item"><a class="page-link" href="#">1</a></li>


							<!-- @@@@@@@@@@@@@@@@@@@@@@@@ -->
							<li class="page-item"><a class="page-link" href="#">Next</a></li>
						</ul>
					</nav>

				</div>
			</div>
		</div>
	</section>


	<!-- Footer -->
	<!-- 사용전 경로를 꼭 수정하세요 ~~ -->
	<c:import url="../temps/footer.jsp"></c:import>
	<script type="text/javascript" src="/resources/js/wish/wishlist.js"></script>
</body>
</html>

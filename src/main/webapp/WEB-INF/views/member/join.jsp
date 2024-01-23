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
					<span class="text-gradient d-inline">Join</span>
				</h1>
			</div>
			<div class="row gx-5 justify-content-center">
				<div class="col-lg-11 col-xl-9 col-xxl-8">
					<form class="form-control" action="./join" method="post"
						enctype="multipart/form-data">
						<div class="mb-3">
							<label for="userName" class="form-label">Id</label> <input
								type="text" name="userName" class="form-control" id="userName">
						</div>

						<div class="mb-3">
							<label for="passWord" class="form-label">passWord</label> <input
								type="password" name="passWord" class="form-control"
								id="passWord">
							<div id="passWordResult"></div>
						</div>

						<div class="mb-3">
							<label for="passWordCheck" class="form-label">passWordCheck</label>
							<input type="password" class="form-control" id="passWordCheck">
							<div id="passWordCheckResult"></div>
						</div>


						<div class="mb-3">
							<label for="name" class="form-label">Name</label> <input
								type="text" name="name" class="form-control" id="name">
						</div>

						<div class="mb-3">
							<label for="email" class="form-label">eMail</label> <input
								type="email" name="email" class="form-control" id="email">
						</div>

						<div class="mb-3">
							<label for="phone" class="form-label">phoneNumBer</label> <input
								type="number" name="phone" class="form-control" id="phone">
						</div>


						<div class="mb-3">
							<label for="addRess" class="form-label">addRess</label> <input
								type="text" name="addRess" class="form-control" id="addRess">
						</div>


						<div class="mb-3">
							<input class="form-control" type="file" name="attachs">
						</div>



						<div class="mb-3">
							<button type="button" id="btn2" class="btn-btn-primary">등록</button>
						</div>
						<img  id="img1" src="../resources/assets/codnjsld.jpeg">
					</form>


				</div>
			</div>
		</section>
	</main>

	<!-- Footer -->
	<!-- 사용전 경로를 꼭 수정하세요 ~~ -->
	<c:import url="../temps/footer.jsp"></c:import>
	<script type="text/javascript"
		src="../resources/js/member/joinCheck.js"></script>
</body>
</html>

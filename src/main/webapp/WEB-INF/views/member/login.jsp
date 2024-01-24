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

		<div class="row gx-5 justify-content-center">
			<div class="col-lg-11 col-xl-9 col-xxl-8">
				<div>
				${msg}
				</div>
				
				<form class="form-control" action="./login" method="post">
					<div class="mb-3">
						<label for="userName" class="form-label" >Id</label> <input value="qkrtjdwp15" 
							type="text" name="userName" class="form-control" id="userName">
					</div>
					<div class="mb-3">
						<label for="passWord" class="form-label">passWord</label> <input
							type="password" name="passWord" value="q1234123" class="form-control"
							id="passWord"><br><br>


						<div class="mb-3">
							<button type="submit" class="btn-btn-primary">로그인</button>
						</div>
					</div>
				</form>
			</div>
		</div>

	</main>

	<!-- Footer -->
	<!-- 사용전 경로를 꼭 수정하세요 ~~ -->
	<c:import url="../temps/footer.jsp"></c:import>
</body>
</html>

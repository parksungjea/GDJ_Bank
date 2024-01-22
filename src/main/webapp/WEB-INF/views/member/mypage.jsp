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
				<div></div>

				
					<div class="mb-3">
						<label for="userName" class="form-label">MyId</label> <input
							type="text" name="userName" value="${member.userName}" readonly="readonly" class="form-control" id="userName">
					</div>

					<div class="mb-3">
						<label for="Name" class="form-label">MyName</label> <input
							type="text" name="name" value="${member.name}" readonly="readonly" class="form-control" id="Name">
					</div>

					<div class="mb-3">
						<label for="email" class="form-label">MyEmail</label> <input
							type="text" name="email" value="${member.email}" readonly="readonly" class="form-control" id="email">
					</div>

					<div class="mb-3">
						<label for="phone" class="form-label">MyPhone</label> <input
							type="text" name="phone" value="${member.phone}" readonly="readonly" class="form-control" id="phone">
					</div>

					<div class="mb-3">
						<label for="addRess" class="form-label">MyAddRess</label> <input
							type="text" name="addRess" value="${member.addRess}" readonly="readonly" class="form-control" id="addRess">
					</div>
					
					<div>
					<img alt="" src="../resources/upload/${member.avatarFileDTO.fileName}">
					</div>

					
					<div>
					<a class="btn btn-primary" href="./update">수정</a>
					</div>
					

			
			</div>
		</div>

	</main>

	<!-- Footer -->
	<!-- 사용전 경로를 꼭 수정하세요 ~~ -->
	<c:import url="../temps/footer.jsp"></c:import>
</body>
</html>

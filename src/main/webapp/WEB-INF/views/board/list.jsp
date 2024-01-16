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
        <title>${board}List</title>
       
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
                 <h1 class="display-5 fw-bolder mb-0"><span class="text-gradient d-inline">${board}List</span></h1>
              </div>
                  <div class="row gx-5 justify-content-center">
                   <div class="col-lg-11 col-xl-9 col-xxl-8">
                   <!-- table -->
                   <div>
                   <table class="table table-hover" >
                    	<thead>
                    	
                    		<tr class="table-dark">
                    		  <th>No</th>
                              <th>Title</th>
                              <th>Writer</th>
                              <th>CONTENTS</th>
                              <th>DATE</th>	
                    		</tr>
                    
                    	</thead>
                        <tbody>
<!--                         	private Long boardNum;
							private String boardTitle;
							private String boardWriter;
							private String boardContents;
							private Date boardDate;
							private Long boardHit; -->
                        <c:forEach items="${list}" var="dto">
                        
                        <c:set var="f" value="0"></c:set>
                        <c:catch>
                        <c:set var="f" value="${dto.flag}"></c:set>
                        <c:if test="${f eq 1}">
                        <tr>
                        <td></td>
                        <td>삭제되었다</td>
                        <td></td>
                        <td></td>
                        <td></td>
                        </tr>
					    </c:if>
				                          
                        </c:catch>
                        <c:if test="${f eq 0}">
                        
                            <tr>
                                <td>${dto.boardNum}</td>
                                <td>
                                <a href="./detail?boardNum=${dto.boardNum}">
                                <c:catch>
                               	<c:forEach begin="1" end="${dto.boardDepth}">--</c:forEach>
                                </c:catch>
                                ${dto.boardTitle}
                                </a>
                                </td>
                                <td>${dto.boardWriter}</td>
                                <td>${dto.boardContents}</td>
                                <td>${dto.boardDate}</td>
                            </tr>
                            </c:if>
                            

                            </c:forEach>

                        </tbody>
                   </table>
                   
                   <div>
                   	<a href="./add" class="">글쓰기</a>
                   </div>
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

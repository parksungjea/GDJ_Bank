<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

                  <div class="row gx-5 justify-content-center">
                   <div class="col-lg-11 col-xl-9 col-xxl-8">
                   <form class="form-control"  method="post" enctype="multipart/form-data" >
                   <input type="hidden" name="boardNum" value="${boardDTO.boardNum }">
                   
                   <div class="mb-3">
					  <label for="Title" class="form-label">Title</label>
					  <input type="text" name="boardTitle" class="form-control"  value="${boardDTO.boardTitle}" id="Title" >
					</div>
<%-- 					 <div class="mb-3">
					  <label for="Writer" class="form-label">Writer</label>
					  <input type="text" value="${member.userName}" name="boardWriter" class="form-control" id="Writer" >
					</div> --%>
					<div class="mb-3">
					  <label for="Contents" class="form-label">Contents</label>
					  <textarea class="form-control" name="boardContents" id="Contents" rows="3">${boardDTO.boardContents}</textarea>
					</div>
					
					<div class="mb-3">
						<input class="form-control" type="file" name="attachs">
						<input class="form-control" type="file" name="attachs">
						<input class="form-control" type="file" name="attachs">
					</div>
					<div class="mb-3">
					<button  class="btn-btn-primary">등록</button>
					</div>
					</form>
                   
                   
                   </div>
                   </div>

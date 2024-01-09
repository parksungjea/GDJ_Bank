package com.winter.app.util;

public class Pager {
 
	private Long startRow;
	private Long lastRow;
	private Long perPage=10L;//몇개씩 조회할거냐
	private Long page;
	
	private Long total;
	//startRow, lastRow계산하는 매서드
	
	public void makeRow() {
		this.lastRow=this.getPage()*this.getPerPage();
		this.startRow=this.lastRow-this.getPerPage()+1;
	}
	
	public void makeNum() {
		//1.총 개수로 총 페이지 수 구하기
		
		//2. 총페이지수로 총 블럭수
		
		//3.현재 페이지 번호로 현재 블럭번호 구하기
		
		//4. 현재 블럭 번호로 시작 번호와 끝번호 구하기
		
		//5.이전, 다음 블럭 유무 구하기
	}
	
	public Long getStartRow() {
		return startRow;
	}
	public void setStartRow(Long startRow) {
		this.startRow = startRow;
	}
	public Long getLastRow() {
		return lastRow;
	}
	public void setLastRow(Long lastRow) {
		this.lastRow = lastRow;
	}

	public Long getPerPage() {
		if(this.perPage==null||this.perPage<1) {
			this.perPage=10L;
		}
		return perPage;
	}

	public void setPerPage(Long perPage) {
		this.perPage = perPage;
	}

	public Long getPage() {
		if(this.page==null || this.page<1) {
		this.page=1L;
		}
		return page;
		}
	

	public void setPage(Long page) {
		this.page = page;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	
	

	
}

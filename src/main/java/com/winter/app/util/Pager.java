package com.winter.app.util;

public class Pager {
	private Integer start_Num;
	private Integer last_Num;
	private Integer page;
	private Integer pager;
	private Integer totalPage;
	private Integer totalBlock;
	private Integer perBlock;
	private Integer start_page;
	private Integer last_page;
	private String search ="";
	private String kind;
	
	
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	
	
	public Integer getPerBlock() {
		return perBlock;
	}

	public void setPerBlock(Integer perBlock) {
		this.perBlock = perBlock;
	}

	public Integer getStart_page() {
		return start_page;
	}

	public void setStart_page(Integer start_page) {
		this.start_page = start_page;
	}

	public Integer getLast_page() {
		return last_page;
	}

	public void setLast_page(Integer last_page) {
		this.last_page = last_page;
	}

	public Integer getTotalBlock() {
		return totalBlock;
	}

	public void setTotalBlock(Integer totalBlock) {
		this.totalBlock = totalBlock;
	}

	public Integer getTotalPage() {
		return totalPage;
	}
	
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	
	public void makeRow() {
		this.last_Num = this.getPage()*this.getPager();
		this.start_Num = this.last_Num - this.getPager() + 1;
	}
	
	public void makeNum() {
		//1. 총 갯수로 총 페이지 수 구하기
		
		//2. 총 페이지수로 총 블럭수 구하기
		
		//3. 현재 페이지번호로 현재 블럭번호 구하기
		
		//4. 현재 블럭번호로 시작번호와 끝번호 구하기 (jsp구역)
		
		//5. 이전,다음 블럭 유무 
		
	}
	
	public Integer getStart_Num() {
		return start_Num;
	}
	public void setStart_Num(Integer start_Num) {
		this.start_Num = start_Num;
	}
	public Integer getLast_Num() {
		return last_Num;
	}
	public void setLast_Num(Integer last_Num) {
		this.last_Num = last_Num;
	}
	public Integer getPage() {
		if(this.page==null || this.page <1)
			this.page = 1;
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getPager() {
		if(this.pager==null || this.pager <1)
			this.pager = 10;
		return pager;
	}
	public void setPager(Integer pager) {
		this.pager = pager;
	}
	
}
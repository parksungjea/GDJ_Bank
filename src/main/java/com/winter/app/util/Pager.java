package com.winter.app.util;

import com.winter.app.board.BoardDAO;
import com.winter.app.board.BoardService;

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

	//이전 블럭이 없으면 true;
	private boolean start;
	//다음 블럭이 없으면 true;
	private boolean last;
	
	private BoardService boardService;
	
	
	
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
	
	public void makeNum(Integer totalCount) throws Exception{
		//1. 총 갯수로 총 페이지 수 구하기
		  
		 
				
		 Integer totalPage = 0;
		 totalPage = totalCount/this.getPager();
		 if(totalCount%this.getPager() !=0) {
			 totalPage++;
		 }
		 this.setTotalPage(totalPage);
		//2. 총 페이지수로 총 블럭수 구하기
		 Integer perBlock=5;
		 this.setPerBlock(perBlock);
		 Integer totalBlock=0;
		 totalBlock=this.getTotalPage()/this.getPerBlock();
		 if(this.getTotalPage()%this.getPerBlock() != 0) {
			 totalBlock++;
		 }
		 this.setTotalBlock(totalBlock);
		 
		
		//3. 현재 페이지번호로 현재 블럭번호 구하기
		Integer curBlock=0;
		curBlock = this.getPage()/this.getPerBlock();
		if(this.getPage()%this.getPerBlock()!=0) {
			curBlock++;
		}
		
		//4. 현재 블럭번호로 시작번호와 끝번호 구하기 (jsp구역)
		Integer startnum=0;
		Integer lastnum=0;
		lastnum= curBlock*this.getPerBlock();
		startnum= lastnum -(this.getPerBlock()-1);
		this.setStart_Num(startnum);
		this.setLast_Num(lastnum);
		//5. 이전,다음 블럭 유무 
		if(curBlock == 1) {
			this.setStart(true);
		}
		if(curBlock == totalBlock) {
		this.setLast_Num(totalPage);
		this.setLast(true);
			
		}
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

	public boolean isStart() {
		return start;
	}
	public void setStart(boolean start) {
		this.start = start;
	}
	public boolean isLast() {
		return last;
	}
	public void setLast(boolean last) {
		this.last = last;
	}
	public BoardService getBoardService() {
		return boardService;
	}
	public void setBoardService(BoardService boardService) {
		this.boardService = boardService;
	}
	
}

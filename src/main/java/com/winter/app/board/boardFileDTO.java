package com.winter.app.board;

import com.winter.app.files.FileDTO;

public class boardFileDTO extends FileDTO{
	private Long boardNum;

	public Long getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(Long boardNum) {
		this.boardNum = boardNum;
	}
	
	
}

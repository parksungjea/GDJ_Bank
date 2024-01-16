package com.winter.app.board.qna;

import java.util.List;

import com.winter.app.board.BoardDTO;
import com.winter.app.board.BoardFileDTO;

public class QnaDTO extends BoardDTO{

	
		private Long boardRef;//질문글 답글간의 그룹으로 구성
		private Long boardStep;//그룹내에서 순서
		private Long boardDepth;//jsp에 출력시 들여쓰기 횟수
		private Integer flag;
		
		private List<BoardFileDTO> fileDTOs;



		
		public Long getBoardRef() {
			return boardRef;
		}
		public void setBoardRef(Long boardRef) {
			this.boardRef = boardRef;
		}
		public Long getBoardStep() {
			return boardStep;
		}
		public void setBoardStep(Long boardStep) {
			this.boardStep = boardStep;
		}
		public Long getBoardDepth() {
			return boardDepth;
		}
		public void setBoardDepth(Long boardDepth) {
			this.boardDepth = boardDepth;
		}

		public Integer getFlag() {
			return flag;
		}

		public void setFlag(Integer flag) {
			this.flag = flag;
		}
		public List<BoardFileDTO> getFileDTOs() {
			return fileDTOs;
		}
		public void setFileDTOs(List<BoardFileDTO> fileDTOs) {
			this.fileDTOs = fileDTOs;
		}

}

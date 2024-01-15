package com.winter.app.board.qna;

import com.winter.app.board.BoardDTO;

public class QnaDTO extends BoardDTO{

	
		private Long ref;//질문글 답글간의 그룹으로 구성
		private Long step;//그룹내에서 순서
		private Long depth;//jsp에 출력시 들여쓰기 횟수
		public Long getRef() {
			return ref;
		}
		public void setRef(Long ref) {
			this.ref = ref;
		}
		public Long getStep() {
			return step;
		}
		public void setStep(Long step) {
			this.step = step;
		}
		public Long getDepth() {
			return depth;
		}
		public void setDepth(Long depth) {
			this.depth = depth;
		}
}

package com.winter.app.board.notice;

import java.util.List;

import com.winter.app.board.BoardDTO;
import com.winter.app.board.boardFileDTO;

public class NoticeDTO extends BoardDTO{

		private List<boardFileDTO> fileDTOs;

		public List<boardFileDTO> getFileDTOs() {
			return fileDTOs;
		}

		public void setFileDTOs(List<boardFileDTO> fileDTOs) {
			this.fileDTOs = fileDTOs;
		}
		
	
}

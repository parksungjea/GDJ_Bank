package com.winter.app.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winter.app.board.BoardDTO;
import com.winter.app.board.notice.NoticeDAO;
import com.winter.app.util.Pager;
@Service
public class QnaService {

		@Autowired
		private QnaDAO noticeQnaDAO;
		
		public List<BoardDTO> getList(Pager pager) throws Exception{
			
			pager.makeRow();
			
			return noticeQnaDAO.getList(pager);
			
		}
		
		public int setAdd(BoardDTO boardDTO) throws Exception{
		return noticeQnaDAO.setAdd(boardDTO);
		}
}

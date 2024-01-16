package com.winter.app.board.qna;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.winter.app.board.BoardDAO;
import com.winter.app.board.BoardDTO;
import com.winter.app.board.BoardFileDTO;
import com.winter.app.board.BoardService;
import com.winter.app.util.FileManager;
import com.winter.app.util.Pager;
@Service
public class QnaService implements BoardService{
	@Autowired
	private ServletContext servletContext;
	@Autowired
	private QnaDAO qnaDAO;
	@Autowired
	private FileManager fileManager;
	
	@Override
	public List<BoardDTO> getList(Pager pager) throws Exception {
		pager.makeRow();
		
		return qnaDAO.getList(pager);
	}

	@Override
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return qnaDAO.getDetail(boardDTO);
	}

	@Override
	public int setAdd(BoardDTO boardDTO, MultipartFile [] attachs) throws Exception {
		
		int result = qnaDAO.setAdd(boardDTO);
		
		String path = servletContext.getRealPath("resources/upload/qna");
		
		for(MultipartFile f : attachs) {
			if(f.isEmpty()) {
				continue;
			}
			
			
			String filename = fileManager.fileSave(path, f);
			
			BoardFileDTO boardFileDTO = new BoardFileDTO();
			boardFileDTO.setFileName(filename);
			boardFileDTO.setOriName(f.getOriginalFilename());
			boardFileDTO.setBoardNum(boardDTO.getBoardNum());
			
			result = qnaDAO.setFileAdd(boardFileDTO);	
		}
		
		
		return result;
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Transactional
	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		//1.file을 삭제
		
		  List<BoardFileDTO> files = qnaDAO.getFileList(boardDTO);
		  String path = servletContext.getRealPath("/resources/upload/qna"); 
		  for(BoardFileDTO b : files) {
			  fileManager.fileDelete(path,b.getFileName()); 
			  } 
		  //2.file table의 정보삭제 
		  int result = qnaDAO.setFileDelete(boardDTO); 
		  //3.qna 정보를 수정
		 result = qnaDAO.setDelete(boardDTO);
		 
		
		return 1;
	}


	

	public int setReply(QnaDTO qnaDTO)throws Exception {
		//boardNum : 부모의 글번호
		//boardTitle : 답글제목
		//boardWriter: 답글작성자
		//boardContents: 답글내용
		//1. 부모의 정보를 조회
		QnaDTO parent = (QnaDTO)qnaDAO.getDetail(qnaDTO);
		//2. 답글 정보 저장(ref, step, depth)
		
		qnaDTO.setBoardRef(parent.getBoardRef());
		qnaDTO.setBoardStep(parent.getBoardStep()+1);
		qnaDTO.setBoardDepth(parent.getBoardDepth()+1);
		
		//3.step을 업데이트
		int result = qnaDAO.setReplyUpdate(parent);
		//4. DB에 답글을 저장
		result = qnaDAO.setReplyAdd(qnaDTO);
		return result;
	}
	
	
		
}

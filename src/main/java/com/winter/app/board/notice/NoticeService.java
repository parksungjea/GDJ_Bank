package com.winter.app.board.notice;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.winter.app.board.BoardDAO;
import com.winter.app.board.BoardDTO;
import com.winter.app.board.BoardService;
import com.winter.app.board.BoardFileDTO;
import com.winter.app.util.FileManager;
import com.winter.app.util.Pager;

@Service
public class NoticeService implements BoardService {
	
	@Autowired
	@Qualifier("na")
	private NoticeDAO boardDAO;
	
	@Autowired
	private FileManager fileManager;
	@Autowired
	private ServletContext servletContext;
	
	public List<BoardDTO> getList(Pager pager) throws Exception {
		pager.makeRow();
		Integer totalCountt = boardDAO.getTotalCount(pager);
		pager.makeNum(totalCountt);
		List<BoardDTO> ar = boardDAO.getList(pager);
		
		//검색
		
		return ar;
	}

	@Override
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.getDetail(boardDTO);
	}

	@Override
	public int setAdd(BoardDTO boardDTO, MultipartFile [] attachs) throws Exception {
		 //1. 글을 등록 - 글번호를 알아오기위해
		int result = boardDAO.setAdd(boardDTO);
		
		//2. 파일을 hdd에 저장
		//2-1 저장할 폴더의 실제 경로 구하기
		String path = servletContext.getRealPath("/resources/upload/notice");
				//2-2 HDD에 저장하고 파일명 받아오기
			for(MultipartFile f : attachs) {
				if(f.isEmpty()) {
					continue;
				}
		String fileName = fileManager.fileSave(path, f);
			
			//2-3 DB에 파일 정보 저장하기
			BoardFileDTO boardFileDTO = new BoardFileDTO();
			boardFileDTO.setFileName(fileName);
			boardFileDTO.setOriName(f.getOriginalFilename());
			boardFileDTO.setBoardNum(boardDTO.getBoardNum());
			result = boardDAO.setFileAdd(boardFileDTO);
			
			}
		return result;
	}

	@Override
	public int setUpdate(BoardDTO boardDTO, MultipartFile [] attachs) throws Exception {
		//HDD에 파일 저장
		return boardDAO.setUpdate(boardDTO);
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		//1. HDD파일삭제
		// 1_1 DB에서 삭제할 파일명들을 조회
		List<BoardFileDTO> ar = boardDAO.getFileList(boardDTO);
		String fileName = servletContext.getRealPath("/resources/upload/notice");
		
		// 1_2. 파일명으로 삭제
		for(BoardFileDTO f : ar) {
			fileManager.fileDelete(fileName, f.getFileName());
		}
		
		//2. DB에서 공지사항하고, 파일정보 삭제
		//2.DB에서삭제
		int result = boardDAO.setFileDelete(boardDTO);
		
		return result;
	}
	
	
	public void setMyPage()throws Exception {
		
		
	}

}

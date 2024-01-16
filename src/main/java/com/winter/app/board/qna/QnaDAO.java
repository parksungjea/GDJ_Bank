package com.winter.app.board.qna;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.winter.app.board.BoardDAO;
import com.winter.app.board.BoardDTO;
import com.winter.app.board.BoardFileDTO;
import com.winter.app.util.Pager;
@Repository
public class QnaDAO implements BoardDAO {
	  @Autowired
	  private SqlSession sqlSession;
	  private String namespace = "com.winter.app.board.qna.QnaDAO.";
	  
	
	  
	  
	  public int setFileAdd(BoardFileDTO boardFileDTO)throws Exception {
		  return sqlSession.insert(namespace+"setFileAdd", boardFileDTO);
		  
	  }
	
	
	@Override
	public Integer getTotalCount(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardDTO> getList(Pager pager) throws Exception {
		
		return sqlSession.selectList(namespace+"getList", pager);
	}

	@Override
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace+"getDetail", boardDTO);
	}

	@Override
	public int setAdd(BoardDTO boardDTO) throws Exception {
		
		return sqlSession.insert(namespace+"setAdd", boardDTO);
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		
		return sqlSession.delete(namespace+"setDelete", boardDTO);
	}
	
	public List<BoardFileDTO> getFileList(BoardDTO boardDTO)throws Exception {
		return sqlSession.selectList(namespace+"getFileList", boardDTO);
		
	}
	
	public int setReplyUpdate(QnaDTO qnaDTO)throws Exception {
		return sqlSession.update(namespace+"setReplyUpdate", qnaDTO);
		
	}

	
	public int setReplyAdd(QnaDTO qnaDTO)throws Exception {
		return sqlSession.insert(namespace+"setReplyAdd", qnaDTO);
		
	}
	
	public int setFileDelete(BoardDTO boardDTO)throws Exception{
		return sqlSession.delete(namespace+"setFileDelete", boardDTO);
		
	}
}

package com.winter.app.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import com.winter.app.member.avatar.AvatarFileDTO;

@Repository
public class MemberDAO {
	@Autowired
	private SqlSession sqlSession;
	private String namespace = "com.winter.app.member.MemberDAO.";
	
	
	
	public int setLogin() throws Exception{
		return sqlSession.insert(namespace+"setLogin");
		
	}
	
	public int setJoin(MemberDTO memberDTO)throws Exception{
		return sqlSession.insert(namespace+"setJoin", memberDTO);
		
	}
	
	public int setFileJoin(AvatarFileDTO avatarFileDTO)throws Exception {
		return sqlSession.insert(namespace+"setFileJoin", avatarFileDTO);
		
	}
	
	public MemberDTO getDetail(MemberDTO memberDTO)throws Exception {
		return sqlSession.selectOne(namespace+"getDetail", memberDTO);
		
	}
	
	public int setUpdate(MemberDTO memberDTO)throws Exception {
		return sqlSession.update(namespace+"setUpdate", memberDTO);
		
	}
	
	//public MemberDTO setMyPage(MemberDTO memberDTO)throws Exception {
		//return sqlSession.selectOne(namespace+"getDetail",memberDTO);
		
	//}
}

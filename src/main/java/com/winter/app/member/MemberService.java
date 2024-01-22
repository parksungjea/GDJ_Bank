package com.winter.app.member;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import com.winter.app.member.avatar.AvatarFileDTO;
import com.winter.app.util.FileManager;

@Service
public class MemberService {
	@Autowired
	private MemberDAO memberDAO;
	@Autowired
	private ServletContext servletContext;
	@Autowired
	private FileManager fileManager;

	public int setJoin(MemberDTO memberDTO, MultipartFile file) throws Exception {
		int result = memberDAO.setJoin(memberDTO);

		String filename = "";
		String path = servletContext.getRealPath("/resources/upload/member");

		AvatarFileDTO avatarFileDTO = new AvatarFileDTO();
		if (file != null) {
			filename = fileManager.fileSave(path, file);
			avatarFileDTO.setFileName(filename);
			avatarFileDTO.setOriName(file.getOriginalFilename());
			avatarFileDTO.setUserName(memberDTO.getUserName());
		}

		result = memberDAO.setFileJoin(avatarFileDTO);
		return result;

	}
	
	public MemberDTO getLogin(MemberDTO memberDTO)throws Exception {
		MemberDTO m = memberDAO.getDetail(memberDTO);
		if(m != null) {
			if(m.getPassWord().equals(memberDTO.getPassWord())) {;
			return m;
			
		}
	}
	return null;
	

			
	}
	
	public  int setUpdate(MemberDTO memberDTO)throws Exception {
		
		return memberDAO.setUpdate(memberDTO);
	
}
	
	
	
	
	//public MemberDTO setMyPage(MemberDTO memberDTO)throws Exception {
		
		
		
//		return memberDAO.getDetail(memberDTO);
		
	//}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

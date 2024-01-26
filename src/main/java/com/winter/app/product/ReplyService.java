package com.winter.app.product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winter.app.util.Pager;

@Service
public class ReplyService {
	@Autowired
	private ReplyDAO replyDAO;
	
	public int setReply(ReplyDTO replyDTO) throws Exception{
		return replyDAO.setReply(replyDTO);
	}
	
	public List<ReplyDTO> setReplyList(ReplyDTO replyDTO,Pager pager) throws Exception{
		pager.setPager(5);
		pager.makeRow();
		pager.makeNum(replyDAO.getTotalCount(replyDTO));
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("pager", pager);
		map.put("replyDTO", replyDTO);
		
		return replyDAO.setReplyList(map);
	}
}

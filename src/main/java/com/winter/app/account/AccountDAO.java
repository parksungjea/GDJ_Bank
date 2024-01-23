package com.winter.app.account;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.winter.app.product.ProductDTO;
import com.winter.app.util.Pager;

@Repository
public class AccountDAO {

	@Autowired
	private SqlSession sqlSession;
	
	private String namespace = "com.winter.app.account.AccountDAO.";
	public int setAdd(AccountDTO accountDTO)throws Exception {
		return sqlSession.insert(namespace+"setAdd", accountDTO);
		
	}
	
	public List<ProductDTO> getList(Pager pager) {
		return sqlSession.selectList(namespace+"getList",pager);
	
	}
	
	public Integer totalCount(Pager pager) {
		return sqlSession.selectOne(namespace+"totalCount", pager);
	}
}

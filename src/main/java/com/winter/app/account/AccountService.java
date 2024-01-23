package com.winter.app.account;

import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winter.app.product.ProductDTO;
import com.winter.app.util.Pager;

@Service
public class AccountService {

	@Autowired
	private AccountDAO accountDAO;
	
	
	public int setAdd(AccountDTO accountDTO)throws Exception {

		Long accountname =System.currentTimeMillis();
		System.out.println(System.currentTimeMillis());
		accountDTO.setAccountNum(accountname);
		return accountDAO.setAdd(accountDTO);
		
	}
	
	public List<ProductDTO> getList(Pager pager)throws Exception {
		pager.makeRow();
		Integer result = accountDAO.totalCount(pager);
		 pager.makeNum(result);
		return accountDAO.getList(pager);
		
	}
}

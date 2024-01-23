package com.winter.app.product;

import java.util.List;

import com.winter.app.account.AccountDTO;

public class ProductDTO {

	private Long productNum;
	private String productName;
	private String productContents;
	private double productRate;
	private double productJumsu;
	private List<AccountDTO> accountDTOs;
	
	public Long getProductNum() {
		return productNum;
	}
	public void setProductNum(Long productNum) {
		this.productNum = productNum;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductContents() {
		return productContents;
	}
	public void setProductContents(String productContents) {
		this.productContents = productContents;
	}
	public double getProductRate() {
		return productRate;
	}
	public void setProductRate(double productRate) {
		this.productRate = productRate;
	}
	public double getProductJumsu() {
		return productJumsu;
	}
	public void setProductJumsu(double productJumsu) {
		this.productJumsu = productJumsu;
	}
	public List<AccountDTO> getAccountDTOs() {
		return accountDTOs;
	}
	public void setAccountDTOs(List<AccountDTO> accountDTOs) {
		this.accountDTOs = accountDTOs;
	}
	
	
	
	
	
	
	
}

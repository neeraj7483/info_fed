package com.infogain.bean;

import org.springframework.stereotype.Component;

@Component
public class Product {

	private int pId;
	private String pName;
	private long price;

	public Product() {
	
	}
	public Product(int pId, String pName, long price) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.price = price;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", price=" + price + "]";
	}

}

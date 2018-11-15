package com.infogain.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.infogain.bean.Product;

@Component
public interface ProductDao {

	public void addProduct(Product p);
	public List<Product> getproducts();
}

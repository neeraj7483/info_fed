package com.infogain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.infogain.bean.Product;
import com.infogain.repo.ProductRepository;

@Service
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private ProductRepository prodRepo;//=new ProductRepository();

	@Override
	public void addProduct(Product p) {
		prodRepo.addProduct(p);

	}

	@Override
	public List<Product> getproducts() {

		return prodRepo.getproducts();
	}

}

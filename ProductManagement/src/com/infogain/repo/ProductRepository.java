package com.infogain.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.infogain.bean.Product;

@Repository
public class ProductRepository {

	static List<Product> plist= new ArrayList<>();
	
	public void addProduct(Product p)
	{
		plist.add(p);
	}
	
	public List<Product> getproducts()
	{
		return plist;
	}
}


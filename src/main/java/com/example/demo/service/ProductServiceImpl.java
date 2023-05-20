package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductRepository;
import com.example.demo.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired 
	private ProductRepository repo;

	@Override
	public void uploadproduct(Product product) {
		// TODO Auto-generated method stub
		try {
		repo.save(product);
	}
	
	catch (Exception e) {
		// TODO: handle exception
		
		e.printStackTrace();
	}
	}
}

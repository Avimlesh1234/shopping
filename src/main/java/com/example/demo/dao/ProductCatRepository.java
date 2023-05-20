package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ProductCategies;

@Repository
public interface ProductCatRepository extends  JpaRepository<ProductCategies, Long> {
	
	

}

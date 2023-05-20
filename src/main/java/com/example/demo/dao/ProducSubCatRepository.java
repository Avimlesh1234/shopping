package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ProductSubCategories;

public interface ProducSubCatRepository extends JpaRepository<ProductSubCategories, Long> {
	
	

}

package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String filename;
	private String typeproduct;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getTypeproduct() {
		return typeproduct;
	}
	public void setTypeproduct(String typeproduct) {
		this.typeproduct = typeproduct;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", filename=" + filename + ", typeproduct=" + typeproduct + "]";
	}
	
	
	
	

}

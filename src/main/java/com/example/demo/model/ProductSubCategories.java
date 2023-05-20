package com.example.demo.model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product_Sub_Category")
public class ProductSubCategories {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="sub_categoryName")
	private String subCategoryName;
	
	
	@Column(name="category_id")
	private String category;
	
	
	@Column(name="category_name")
	private String categoryName;
	
	
	 @Column(name = "imagedata")
	 private byte[] imageData;
	
	
	@Column(name="description")
	private String description;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getSubCategoryName() {
		return subCategoryName;
	}


	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getCategoryName() {
		return categoryName;
	}


	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public byte[] getImageData() {
		return imageData;
	}


	public void setImageData(byte[] imageData) {
		this.imageData = imageData;
	}


	@Override
	public String toString() {
		return "ProductSubCategories [id=" + id + ", subCategoryName=" + subCategoryName + ", category=" + category
				+ ", categoryName=" + categoryName + ", imageData=" + Arrays.toString(imageData) + ", description="
				+ description + "]";
	}


	
	

}

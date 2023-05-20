package com.example.demo.controller;

import org.springframework.aop.framework.autoproxy.AbstractAutoProxyCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ProducSubCatRepository;
import com.example.demo.dao.ProductCatRepository;
import com.example.demo.model.ProductCategies;
import com.example.demo.model.ProductSubCategories;
import com.example.demo.response.ProductResponse;

@RestController
public class ProductManagementController {
	
	
	@Autowired 
	private ProductCatRepository productcatdao;
	
	@Autowired
	private ProducSubCatRepository productsubcatdao;
	
	@PostMapping("add_product_category")
	public @ResponseBody ProductResponse addproductCategory(@RequestBody ProductCategies  productcat)
	{
		ProductCategies prodcategori=new ProductCategies();
		
		ProductResponse res=new ProductResponse();
		if(productcat.getCategoryName()!=null&& productcat.getDescription()!=null)
		{
			prodcategori=productcatdao.save(productcat);
			if(prodcategori!=null)
			{
				res.setMesssage("save");
				
				
				return res;
				
			
			}
			res.setMesssage("something wrong");
			res.setStatus("400");
			return res;

		}
	
	
		return res;
	
		
	}
	
	
	@PostMapping("add_product_sub_category")
	
	public @ResponseBody ProductResponse addproductSubCategory(@RequestBody ProductSubCategories  productsubcat)
	{
	ProductSubCategories prodcategori=new ProductSubCategories();
		
		ProductResponse res=new ProductResponse();
		
		
		if(productsubcat.getCategoryName()!=null&& productsubcat.getDescription()!=null && productsubcat.getSubCategoryName()!=null)
		{
			prodcategori=productsubcatdao.save(productsubcat);
			if(prodcategori!=null)
			{
				res.setMesssage("save");
				return res;	
			}
			res.setMesssage("something wrong");
			res.setStatus("400");
			return res;

		}
	
	
		return res;
		
	}
	
	
	
	
	
	

}

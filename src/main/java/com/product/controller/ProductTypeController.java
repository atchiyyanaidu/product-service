package com.product.controller;

import com.product.model.ProductTypeModel;
import com.product.serviceImpl.ProductTypeServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/productType/v3")
public class ProductTypeController {
	
	@Autowired
	private ProductTypeServiceImpl productTypeServiceImpl;
	
	@PostMapping("/create")
	public void createProductType(@RequestBody ProductTypeModel productTypeModel) {
		productTypeServiceImpl.createProductType(productTypeModel);
	}

}

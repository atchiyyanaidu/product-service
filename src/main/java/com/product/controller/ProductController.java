package com.product.controller;

import java.util.List;
import java.util.UUID;

import com.product.model.ProductModel;
import com.product.serviceImpl.ProductServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product-service/api/v1")
public class ProductController {

	@Autowired
	private ProductServiceImpl productServiceImpl;

	@PostMapping("/create")
	public ProductModel createProduct(@RequestBody ProductModel productModel) {
		productModel.setProductGuid(UUID.randomUUID().toString());

		productServiceImpl.createProduct(productModel);
		return productModel;
	}

	@GetMapping("/findByname/{name}")
	public List<ProductModel> findByName(@PathVariable String name) {
		return productServiceImpl.findByName(name);

	}

	@PutMapping("/update")
	public void updateProduct(@RequestBody ProductModel productModel) {
		productServiceImpl.updateProduct(productModel);
	}

	@DeleteMapping("/delete/{name}")
	public void deleteByName(@PathVariable String name) {
		productServiceImpl.deleteByName(name);
	}
	
	@DeleteMapping("/deleteById/{productGuid}")
    public void deleteById(@PathVariable String productGuid) {
		productServiceImpl.deleteById(productGuid);
    }
	
	@GetMapping("/findByProductCode/{productCode}")
	public ProductModel findByProductName(@PathVariable String productCode) {
		return productServiceImpl.findByProdutCode(productCode);
	}
}

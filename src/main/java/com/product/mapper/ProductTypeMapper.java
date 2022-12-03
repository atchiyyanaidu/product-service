package com.product.mapper;

import com.product.entity.ProductTypeEntity;
import com.product.model.ProductTypeModel;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ProductTypeMapper {
	
	public ProductTypeEntity modleToProductTypeEntity(ProductTypeModel  productTypeModel) {
		ProductTypeEntity productTypeEntity =new ProductTypeEntity();
		BeanUtils.copyProperties(productTypeModel, productTypeEntity);
		return productTypeEntity;
		
	}

}

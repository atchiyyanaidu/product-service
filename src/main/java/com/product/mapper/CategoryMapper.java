package com.product.mapper;

import com.product.entity.CategoryEntity;
import com.product.model.CategoryModel;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapper {
	
	public CategoryEntity modelToCategoryEntity(CategoryModel CategoryModel) {
		CategoryEntity categoryEntity =new CategoryEntity();
		BeanUtils.copyProperties(CategoryModel, categoryEntity);
		return categoryEntity;
		
	}

}

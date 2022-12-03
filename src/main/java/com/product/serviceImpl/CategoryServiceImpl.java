package com.product.serviceImpl;

import com.product.mapper.CategoryMapper;
import com.product.model.CategoryModel;
import com.product.repository.CategoryRepository;
import com.product.service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements  CategoryService{
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private CategoryMapper categoryMapper;

	@Override
	public void createCategory(CategoryModel CategoryModel) {
		categoryRepository.save(categoryMapper.modelToCategoryEntity(CategoryModel));
		
	}

}

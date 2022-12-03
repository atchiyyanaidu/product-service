package com.product.serviceImpl;

import com.product.mapper.ProductTypeMapper;
import com.product.model.ProductTypeModel;
import com.product.repository.ProductTypeRepository;
import com.product.service.ProductTypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductTypeServiceImpl implements ProductTypeService {
	
	@Autowired
	private ProductTypeRepository productTypeRepository;
	
	@Autowired
	private ProductTypeMapper ProductTypeMapper;

	@Override
	public void createProductType(ProductTypeModel ProductTypeModel) {
		productTypeRepository.save(ProductTypeMapper.modleToProductTypeEntity(ProductTypeModel));
	}

}

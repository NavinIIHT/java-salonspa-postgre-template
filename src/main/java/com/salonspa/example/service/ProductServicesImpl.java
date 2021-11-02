package com.salonspa.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.salonspa.example.dto.ProductDto;
import com.salonspa.example.repository.ProductRepository;

public class ProductServicesImpl implements ProductService {

	@Autowired
	private ProductRepository productReposiroty;

	@Override
	public ProductDto saveProduct(ProductDto product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductDto> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductDto deleteProduct(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

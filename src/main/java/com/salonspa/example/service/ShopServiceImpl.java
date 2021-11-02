package com.salonspa.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.salonspa.example.dto.ShopDto;
import com.salonspa.example.repository.ShopRepository;

public class ShopServiceImpl implements ShopService {
	@Autowired
	private ShopRepository repository;

	@Override
	public ShopDto saveShop(ShopDto shopDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShopDto> getShops() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShopDto deleteShop(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

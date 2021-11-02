package com.salonspa.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.salonspa.example.dto.ServicesDto;
import com.salonspa.example.repository.ServiceRepository;


public class ServicesServiceImpl implements ServicesService {
	@Autowired
	private ServiceRepository serviceRepository;

	@Override
	public ServicesDto saveService(ServicesDto services) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ServicesDto> getServices() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServicesDto deleteService(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.salonspa.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.salonspa.example.dto.BeauticianDto;
import com.salonspa.example.repository.BeauticianRepository;

public class BeauticianServiceImpl implements BeauticianService {
	@Autowired
	private BeauticianRepository beauticianRepository;

	@Override
	public BeauticianDto saveBeautician(BeauticianDto beauticianDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BeauticianDto> getBeauticians() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BeauticianDto deleteBeautician(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

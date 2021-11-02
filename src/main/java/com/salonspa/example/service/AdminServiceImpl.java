package com.salonspa.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.salonspa.example.dto.AdminDto;
import com.salonspa.example.repository.AdminRepository;

public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepo;

	@Override
	public AdminDto saveAdmin(AdminDto admindto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdminDto> getAdmins() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdminDto deleteAdmin(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

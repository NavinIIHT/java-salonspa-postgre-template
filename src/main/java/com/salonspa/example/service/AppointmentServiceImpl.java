package com.salonspa.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.salonspa.example.dto.AppointmentDto;
import com.salonspa.example.repository.AppointmentRepository;


public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	private AppointmentRepository appointmentRepository;

	@Override
	public AppointmentDto saveAppointment(AppointmentDto appointment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AppointmentDto> getAppointments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AppointmentDto deleteAppointment(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

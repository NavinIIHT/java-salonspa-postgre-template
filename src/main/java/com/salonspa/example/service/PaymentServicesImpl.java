package com.salonspa.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.salonspa.example.dto.PaymentDto;
import com.salonspa.example.repository.PaymentRepository;

public class PaymentServicesImpl implements PaymentService {

	@Autowired
	private PaymentRepository paymentRepository;

	@Override
	public PaymentDto savePayment(PaymentDto paymentDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PaymentDto> getPayments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaymentDto deletePayment(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.nodom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nodom.model.Customer;
import com.nodom.repository.CustomerRepository;
import com.nodom.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
		
	@Autowired
	private CustomerRepository customerrepository;
	
	public List<Customer> getAllCustomers(){
		return customerrepository.getAllCustomers();
	}
}

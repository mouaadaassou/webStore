package com.nodom.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nodom.model.Customer;
import com.nodom.repository.CustomerRepository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository{
	
	 private List<Customer> listOfCustomer = new ArrayList<Customer>();
	 
	 public InMemoryCustomerRepository(){
		 Customer customer1 = new Customer(1, "moaad", "Silicon valley", 3);
		 Customer customer2 = new Customer(2, "abdelilah", "Los Angelos", 5);
		 Customer customer3 = new Customer(3, "amina", "London", 2);
		 listOfCustomer.add(customer1);
		 listOfCustomer.add(customer2);
		 listOfCustomer.add(customer3);
	 }
	
	public List<Customer> getAllCustomers(){
		return this.listOfCustomer; 
	}
}

package com.nodom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nodom.model.Product;
import com.nodom.repository.ProductRepository;
import com.nodom.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired	
	private ProductRepository productRepository;

	public void processorOrder(String productId, long quantity) {
		Product productById = productRepository.getProductById(productId);
		
		if(productById.getUnitsInStock() < quantity){
			throw new IllegalArgumentException("Out Of Stock. Available Units is Stock : " + productById.getUnitsInStock());
		}
		productById.setUnitsInStock(productById.getUnitsInStock() - quantity);
	}
	
}

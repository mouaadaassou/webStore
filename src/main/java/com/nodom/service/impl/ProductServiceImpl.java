package com.nodom.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nodom.model.Product;
import com.nodom.repository.ProductRepository;
import com.nodom.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAllProducts(){
		return this.productRepository.getAllProducts();
	}
	
	public Product getProductById(String productId){
		return this.productRepository.getProductById(productId);
	}
	
	public List<Product> getProductsByCategory(String categroy){
		return productRepository.getProductsByCategory(categroy);
	}
	
	public Set<Product> getProductsByFilter(Map<String, List<String>> filterParams	){
		return productRepository.getProductsByFilter(filterParams);
	}
	
	public void addProduct(Product product){
		this.productRepository.addProduct(product);
	}

}

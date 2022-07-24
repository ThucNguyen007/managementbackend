package com.spring.AWS.products.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.AWS.products.Product;
import com.spring.AWS.products.ProductRepository;

@RestController
public class ProductController {
	
	@Autowired
	private ProductRepository repository;

	@RequestMapping("/products")
	public Iterable<Product> getProducts() {
		return repository.findAll();
	}
	
}

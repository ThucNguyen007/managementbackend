package com.spring.AWS;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.AWS.products.Product;
import com.spring.AWS.products.ProductRepository;
import com.spring.AWS.users.Owner;
import com.spring.AWS.users.OwnerRepository;
import com.spring.AWS.users.User;
import com.spring.AWS.users.UserRepository;

@SpringBootApplication
public class ProductDevelopmentApplication {
	
	private static final Logger logger = 
			LoggerFactory.getLogger(ProductDevelopmentApplication.class);

	@Autowired
	private ProductRepository repository;

	@Autowired
	private OwnerRepository orepository;

	// @Autowired
	// private UserRepository urepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProductDevelopmentApplication.class, args);
	}
	
	/*@Override
	public void run(String... args) throws Exception {
		// Add owner objects and save these to database
		Owner owner1 = new Owner("John" , "Johnson");
		Owner owner2 = new  Owner("Mary" , "Robinson");
		Owner owner3 = new Owner("Thcu", "Williams");
		
		orepository.saveAll(Arrays.asList(owner1, owner2, owner3));

		// Add car object and link to owners and save these to database
		Product product1 = new Product("Mustang", "ADF-1121", "Red", "Ford", 59000, owner1);
		Product product2 = new Product("Maxima", "SSJ-3002", "White", "Nissan", 29000, owner2);
		Product product3 = new Product("Avalon", "KKO-0212", "Silver", "Toyota",  39000, owner3);
		
		repository.saveAll(Arrays.asList(product1, product2, product3));

		for (Product product : repository.findAll()) {
			logger.info(product.getBrand() + " " + product.getColor());
		}
		
		//urepository.save(new User("user", "user", "USER"));
		//urepository.save(new User("admin", "admin", "ADMIN"));
	} */
}

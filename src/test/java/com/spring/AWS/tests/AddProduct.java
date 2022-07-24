package com.spring.AWS.tests;

import java.util.Date;
import java.util.Optional;

import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.spring.AWS.products.Product;
import com.spring.AWS.products.ProductRepository;
import com.spring.AWS.users.Owner;
import com.spring.AWS.users.OwnerRepository;
import com.spring.AWS.users.User;
import com.spring.AWS.users.UserRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class AddProduct {
	
	@Autowired
	private ProductRepository repository;

	@Autowired
	private OwnerRepository orepository;

	@Autowired
	private UserRepository urepository;
	
	@Test
	void saveOwner() {
		orepository.save(new Owner("Thcu", "Smith"));
		assertThat(orepository.findByFirstname("Thcu").isPresent()).isTrue();
	}
	
}

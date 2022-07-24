package com.spring.AWS.products;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductRepository extends CrudRepository<Product, Long> {
	
	// Fetch cars by brand
	List<Product> findByBrand(@Param("brand") String brand);
	// Fetch cars by color
	List<Product> findByColor(@Param("color") String color);
	
}

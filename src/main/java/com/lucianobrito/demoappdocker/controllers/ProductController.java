package com.lucianobrito.demoappdocker.controllers;

import java.util.ArrayList;
import java.util.List;

import com.lucianobrito.demoappdocker.entities.Product;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@GetMapping
	public ResponseEntity<List<Product>> findAllProducts() {
		return ResponseEntity.ok(getProducts());
	}
	
	private List<Product> getProducts() {
		List<Product> products = new ArrayList<>();
		for(long i = 1; i<=10; i++) {
			products.add(new Product(i, "Produto"+i));
		}
		return products;
	}
}

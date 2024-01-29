package com.example.azureAssignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.azureAssignment.entity.Product;
import com.example.azureAssignment.repo.ProductRepo;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductRepo prodRepo;
	
	@GetMapping("/get")
	public List<Product> getData()
	{
		return prodRepo.findAll();
	}
	
	@PostMapping("/add")
	public Product addData(@RequestBody Product newProd)
	{
		return prodRepo.save(newProd);
	}
	
}

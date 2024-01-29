package com.example.azureAssignment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.azureAssignment.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}

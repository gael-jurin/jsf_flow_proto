package com.proto.jsflow.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.proto.jsflow.domain.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}

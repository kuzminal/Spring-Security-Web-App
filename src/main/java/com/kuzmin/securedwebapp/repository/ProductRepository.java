package com.kuzmin.securedwebapp.repository;

import com.kuzmin.securedwebapp.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}

package com.kuzmin.securedwebapp.service;

import com.kuzmin.securedwebapp.domain.Product;
import com.kuzmin.securedwebapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }
}

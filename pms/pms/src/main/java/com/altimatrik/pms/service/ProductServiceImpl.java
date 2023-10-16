package com.altimatrik.pms.service;

import com.altimatrik.pms.entity.Product;
import com.altimatrik.pms.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    public void createProduct(Product product){
        System.out.println("Service class");
        productRepository.save(product);
    }
}

package com.altimatrik.pms.repository;

import com.altimatrik.pms.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ProductRepository extends JpaRepository<Product,Integer> {

}


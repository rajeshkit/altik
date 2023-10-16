package com.altimatrik.cms.repository;

import com.altimatrik.cms.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer,Integer> {
}

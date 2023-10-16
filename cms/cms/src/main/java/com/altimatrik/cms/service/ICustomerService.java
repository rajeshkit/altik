package com.altimatrik.cms.service;
import com.altimatrik.cms.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    public Customer createCustomer(Customer cutomer);
    public List<Customer> getAllCustomer();
    public Customer getCustomerById(int customerId);
    public Customer updateCustomer(Customer customer);
    public Optional<Customer> deleteCustmomer(int customerId);
}










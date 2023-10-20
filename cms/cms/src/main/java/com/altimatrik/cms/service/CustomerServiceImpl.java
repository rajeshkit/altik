package com.altimatrik.cms.service;

import com.altimatrik.cms.entity.Customer;
import com.altimatrik.cms.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CustomerServiceImpl implements ICustomerService{
    @Autowired
    private ICustomerRepository customerRepository;
    @Override
    public Customer createCustomer(Customer customer) {
        Customer c=customerRepository.save(customer);
        return c;
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerById(int customerId) {
       Optional<Customer> opt =customerRepository.findById(customerId);
       Customer c=null;
       if(opt.isPresent()){
            c=opt.get();
        }
        return c;
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        Optional<Customer> opt=customerRepository.findById(customer.getCustomerId());
        if(opt.isPresent()){
            customerRepository.save(customer);
        }
        return customer;
    }

    @Override
    public Optional<Customer> deleteCustmomer(int customerId) {
        customerRepository.deleteById(customerId);
        return  customerRepository.findById(customerId);
    }
}

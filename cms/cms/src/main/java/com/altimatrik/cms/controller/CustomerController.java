package com.altimatrik.cms.controller;

import com.altimatrik.cms.entity.Customer;
import com.altimatrik.cms.exception.CustomerIdNotFoundException;
import com.altimatrik.cms.service.CustomerServiceImpl;
import com.altimatrik.cms.service.ICustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer-api")
@CrossOrigin
public class CustomerController {
    @Autowired
    private ICustomerService customerService;
    @PostMapping(path = "/customer")
    public Customer createCutomer(@RequestBody @Valid Customer customer){
        return  customerService.createCustomer(customer);
    }
    @GetMapping(path = "/customers")
    public List<Customer> getAllCustomer(){
        return customerService.getAllCustomer();
    }
    @GetMapping(path = "/customer/{id}")
    public Customer getCustomerById(@PathVariable("id") int custId) throws CustomerIdNotFoundException {
        if(customerService.getCustomerById(custId)==null){
            throw new CustomerIdNotFoundException("Id not found exception");
        }
        return customerService.getCustomerById(custId);
    }
    @PutMapping(path ="/customer")
    public Customer updateCustomer(@RequestBody Customer customer){
            return customerService.updateCustomer(customer);


    }
    @DeleteMapping(path = "/customer/{id}")
    public Customer deleteCustomer(@PathVariable("id") int custId){
        return customerService.deleteCustmomer(custId).get();


    }
}







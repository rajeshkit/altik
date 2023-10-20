package com.altimatrik.cms.service;

import com.altimatrik.cms.entity.Customer;
import com.altimatrik.cms.repository.ICustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doNothing;

@ExtendWith(MockitoExtension.class)
class CustomerServiceImplTest {
    @Mock
    private ICustomerRepository customerRepository;
    @InjectMocks
    private CustomerServiceImpl customerService;
    @Test
    void createCustomer() {
        Customer c1=
                new Customer(123,"abc",new Date(System.currentTimeMillis()),true);
        Mockito.when(customerRepository.save(c1)).thenReturn(c1);
        assertEquals(c1,customerService.createCustomer(c1));
    }

    @Test
    void getAllCustomer() {
        Customer c1=
                new Customer(123,"abc",new Date(System.currentTimeMillis()),true);
        Customer c2=
                new Customer(124,"bcd",new Date(System.currentTimeMillis()),false);
        List<Customer> customerList= Arrays.asList(c1,c2);
        Mockito.when(customerRepository.findAll()).thenReturn(customerList);
        assertEquals(2,customerService.getAllCustomer().size());
    }

    @Test
    void getCustomerById() {
        Customer c1=
                new Customer(123,"abc",new Date(System.currentTimeMillis()),true);
        Mockito.when(customerRepository.findById(123)).thenReturn(Optional.of(c1));
        assertEquals(c1,customerService.getCustomerById(123));
    }

    @Test
    void updateCustomer() {

    }

    @Test
    void deleteCustmomer() {
        Customer c11=new Customer();
        Optional<Customer> c1=Optional.of(c11);
        Mockito.when(customerRepository.findById(123)).thenReturn(c1);
        doNothing().when(customerRepository).deleteById(123);

                //new Customer(123,"abc",new Date(System.currentTimeMillis()),true);

        assertEquals(0,customerService.deleteCustmomer(123).get().getCustomerId());

    }
}
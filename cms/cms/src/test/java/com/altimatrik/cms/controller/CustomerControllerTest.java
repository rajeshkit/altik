package com.altimatrik.cms.controller;

import com.altimatrik.cms.entity.Customer;
import com.altimatrik.cms.repository.ICustomerRepository;
import com.altimatrik.cms.service.CustomerServiceImpl;
import com.altimatrik.cms.service.ICustomerService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.MockMvcAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CustomerController.class)
class CustomerControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private CustomerServiceImpl customerService;
//    @Test
//    void createCutomer() {
//    }

    @Test
    void getAllCustomer() throws Exception {
        Customer c1=
                new Customer(123,"abc",new Date(System.currentTimeMillis()),true);
        Customer c2=
                new Customer(124,"bcd",new Date(System.currentTimeMillis()),false);
        List<Customer> customerList= Arrays.asList(c1,c2);
        Mockito.when(customerService.getAllCustomer()).thenReturn(customerList);
//        mockMvc.perform(MockMvcRequestBuilders.get("/customers").accept(MediaType.APPLICATION_JSON))
//               .andExpect(status().isOk())
//                .andDo(print());
        mockMvc.perform(MockMvcRequestBuilders
                        .get("/customers")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

    }

    @Test
    void getCustomerById() throws Exception {
        Customer c1=
                new Customer(123,"abc",new Date(System.currentTimeMillis()),true);
       // List<Customer> customerList= Arrays.asList(c1,c2);
        Mockito.when(customerService.getCustomerById(anyInt())).thenReturn(c1);
        mockMvc.perform(MockMvcRequestBuilders.get("/customer/{id}",123).accept(MediaType.APPLICATION_JSON))
                .andDo(print());


    }

//
//    @Test
//    void updateCustomer() {
//    }
//
//    @Test
//    void deleteCustomer() {
//    }
}
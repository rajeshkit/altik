package com.altimatrik.cms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sales-api")
public class SalesController {
    @GetMapping("/sale")
    public String getSales(){
        return "sale is called";
    }
    @GetMapping("/sales")
    public String getAllSales(){
        return "sales is called";
    }
}

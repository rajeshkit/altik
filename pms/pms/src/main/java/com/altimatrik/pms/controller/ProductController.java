package com.altimatrik.pms.controller;

import com.altimatrik.pms.entity.Product;
import com.altimatrik.pms.service.ProductService;
import com.altimatrik.pms.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;
    @RequestMapping(path = "/product",method = RequestMethod.POST)
    @ResponseBody
    public void createProduct(@RequestBody Product product){
        // create a product resource - productId,productName, productCost
        productService.createProduct(product);

    }
}

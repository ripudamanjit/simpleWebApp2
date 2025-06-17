package com.telusko.simpleWebApp.controller;

import com.telusko.simpleWebApp.model.Product;
import com.telusko.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController

public class ProductContoller {


    @Autowired
    ProductService service;
    @RequestMapping("/products")

    public List<Product> getProducts() {
        return service.getProducts();
    }
}

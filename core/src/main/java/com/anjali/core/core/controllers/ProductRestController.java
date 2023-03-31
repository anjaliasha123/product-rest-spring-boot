package com.anjali.core.core.controllers;

import com.anjali.core.core.model.Product;
import com.anjali.core.core.repos.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestController {

    @Autowired
    ProductRepo repo;
    @RequestMapping(value="/products/", method = RequestMethod.GET)
    public List<Product> getProducts(){
        return repo.findAll();
    }
}

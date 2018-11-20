package com.springmvc.springmongodbapp.controllers;


import com.springmvc.springmongodbapp.models.Product;
import com.springmvc.springmongodbapp.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/Products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping(value = "/Products/{id}")
    public Product getProduct(@PathVariable("id") String id) {
      return productService.getProduct(id);
    }

    // @RequestMapping(method = RequestMethod.POST,value="/Products", consumes = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping(value = "/Products")
    public List<Product> addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @DeleteMapping(value = "/Products/{id}")
    public void deleteProduct(@PathVariable String id) {
        productService.deleteProduct(id);
    }

    @PutMapping(value="/Products/{id}")
    public void updateProduct(@RequestBody Product product,@PathVariable String id){
        productService.updateProduct(id,product);
    }






}
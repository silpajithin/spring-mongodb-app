package com.springmvc.springmongodbapp.services;

import com.springmvc.springmongodbapp.models.Product;
import com.springmvc.springmongodbapp.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.lang.Boolean.TRUE;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    /*//private String products="All products";
    private static List<Product> products= new ArrayList<>();

    static {
        Product p1 = new Product("PID1","Shampoo","Arnica FINDER");
        Product p2 = new Product("PID2","Soap","Dove");
        Product p3 = new Product("PID3","Cream","Cetaphll");
        products.add(p1);
        products.add(p2);
        products.add(p3);
    }*/

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> addProduct(Product product){
        productRepository.save(product);
        System.out.println(product);
        return productRepository.findAll();
    }

    public void deleteProduct(String id) {
       productRepository.deleteById(id);
    }

   public Product getProduct(String id) {

      //  if(productRepository.findById(id).isPresent()==TRUE)
            return productRepository.findById(id).get();

    }

    public void updateProduct(String id,Product product) {
       productRepository.save(product);
    }
}

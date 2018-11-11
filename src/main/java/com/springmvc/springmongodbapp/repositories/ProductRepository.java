package com.springmvc.springmongodbapp.repositories;

import com.springmvc.springmongodbapp.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository  extends MongoRepository<Product,String>{
}

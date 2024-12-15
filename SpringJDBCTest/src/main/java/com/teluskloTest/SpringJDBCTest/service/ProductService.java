package com.teluskloTest.SpringJDBCTest.service;

import com.teluskloTest.SpringJDBCTest.model.Product;
import com.teluskloTest.SpringJDBCTest.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {

    private ProductRepo repo;

    public ProductRepo getRepo() {
        return repo;
    }
   @Autowired
    public void setRepo(ProductRepo repo) {
        this.repo = repo;
    }

    public void addProduct(Product p){
        repo.save(p);
        System.out.println("Product is added.");
    }
    public List<Product> getProduct( ){
        return repo.findAll();

    }
    public void updateData(Product p){
        repo.saveUpdate(p);
    }

}

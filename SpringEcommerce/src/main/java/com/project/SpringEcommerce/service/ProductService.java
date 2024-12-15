package com.project.SpringEcommerce.service;

import com.project.SpringEcommerce.model.Product;
import com.project.SpringEcommerce.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepo repo;
    public  List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product getProduct(int productId) {
        return repo.findById(productId).orElse(null);
    }

    public Product addProduct(Product product, MultipartFile image) throws IOException {
        product.setImageName(image.getOriginalFilename());
        product.setImageType(image.getContentType());
        product.setImageData(image.getBytes());

        return repo.save(product);
    }

    public Product updateProduct(Product product, MultipartFile image) throws IOException {
        product.setImageName(image.getOriginalFilename());
        product.setImageData(image.getBytes());
        product.setImageType(image.getContentType());
        return  repo.save(product);
    }

    public void deleteProduct(int productId) {
        repo.deleteById(productId);

    }

    public List<Product> searchProducts(String keyword) {
        return  repo.searchProducts(keyword);
    }
}
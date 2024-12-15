package com.project.SpringEcommerce.Controller;

import com.project.SpringEcommerce.model.Product;
import com.project.SpringEcommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class ProductController {
    @Autowired
    private ProductService service;
    @GetMapping("products")
    public List<Product> getProducts() {
        return service.getAllProducts();
    }

    @GetMapping("product/{productID}")
    public ResponseEntity<Product> getProduct(@PathVariable  int productID){
        Product product = service.getProduct(productID);
        if(product != null)
        return new ResponseEntity<>(product, HttpStatus.OK);
        else
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }

    @PostMapping("/product")

    public ResponseEntity<?> addProduct(@RequestPart Product product, @RequestPart MultipartFile imageFile) {
        Product savedProduct = null;
        try {
            savedProduct = service.addProduct(product, imageFile);
            return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
        } catch (IOException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }


    @GetMapping("/product/{productId}/image")
    public ResponseEntity<byte[]> getImage(@PathVariable int productId){
        Product product = service.getProduct(productId);
        return new ResponseEntity<>(product.getImageData(),HttpStatus.OK);

    }

    @PutMapping("/product/{productId}")
    public ResponseEntity<String>updateProduct(@RequestPart Product product , @RequestPart MultipartFile imageFile){
        Product updateProduct = null;
        try{
            product = service.updateProduct(product,imageFile);
            return new ResponseEntity<>("Updated",HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/product/{productId}")
    public ResponseEntity<String> deleteProduct(@PathVariable int productId){
        Product product = service.getProduct(productId);
        if(product != null){
            service.deleteProduct(productId);
            return new ResponseEntity<>("Deleted",HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/products/search")
    public ResponseEntity<List<Product>> searchProducts(@RequestParam String keyword) {
        ProductController productService;
        List<Product> products = service.searchProducts(keyword);
        System.out.println("searching with :" + keyword);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}

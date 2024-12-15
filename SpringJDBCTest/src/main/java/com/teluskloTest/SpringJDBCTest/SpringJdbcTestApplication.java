package com.teluskloTest.SpringJDBCTest;

import com.teluskloTest.SpringJDBCTest.model.Product;
import com.teluskloTest.SpringJDBCTest.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcTestApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(SpringJdbcTestApplication.class, args);
		Product prod = context.getBean(Product.class);

		ProductService prodService = context.getBean(ProductService.class);
		prod.setpID(101);
		prod.setpName("kebab");
		prod.setLocation("Hyderabad");
		//prodService.addProduct(prod);
		//prodService.updateData(prod);

		List<Product> products =prodService.getProduct();
		System.out.println(products);

	}

}

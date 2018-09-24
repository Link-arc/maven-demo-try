package controllers;

import domain.Product;
import domain.User;
import models.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Qualifier
@RestController
public class ProductController{

    private ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/listuser")
    public List<User> getAllUser() {
        List<User> users = this.userRepository.findAll();
        return this.userRepository.findAll();
    }

    @GetMapping("/products")
    public List<Product> getAllProduct() {
        //List<User> users = this.userRepository.findAll();
        List<Product> products = this.productRepository.findAll();
        return products;
    }
}

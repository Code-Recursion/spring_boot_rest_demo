package com.example.crud.example.controller;

import com.example.crud.example.entity.Product;
import com.example.crud.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    private Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    private List<Product> addProducts(@RequestBody List<Product> products) {
        return service.saveProducts(products);
    }

    @GetMapping("/products")
    private List<Product> findAllProducts() {
        return service.getProducts();
    }

    @GetMapping("/productById/{id}")
    private Product findProduct(@PathVariable int id) {
        return service.getProductById(id);
    }

    @GetMapping("/product/{name}")
    private Product findProductByname(@PathVariable String name) {
        return service.getProductByName(name);
    }

    @DeleteMapping("/delete/{id}")
    private String deleteProduct(@PathVariable int id) {
        return service.deleteProductById(id);
    }

    @PutMapping("/update")
    private Product updateProduct(@RequestBody Product product) {
        return service.updateProduct(product);
    }

}

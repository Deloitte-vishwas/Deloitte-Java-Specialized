package com.cloudthat.productsapp.controller;

import com.cloudthat.productsapp.model.ApiResponse;
import com.cloudthat.productsapp.model.ProductModel;
import com.cloudthat.productsapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/api/products")
    public ResponseEntity<ApiResponse> getAllProducts(){
        List<ProductModel> products = productService.getProducts();
        return new ResponseEntity<ApiResponse>(new ApiResponse(true,"products fetched successfully",products), HttpStatus.OK);
    }

    @PostMapping("/api/products")
    public ResponseEntity<ApiResponse> createProduct(@RequestBody ProductModel productModel){
        ProductModel createdProduct = productService.createProduct(productModel);
        return new ResponseEntity<ApiResponse>(new ApiResponse(true,"product created successfully",createdProduct), HttpStatus.CREATED);
    }
}

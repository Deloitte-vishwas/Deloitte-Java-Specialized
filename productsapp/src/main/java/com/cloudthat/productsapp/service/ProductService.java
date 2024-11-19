package com.cloudthat.productsapp.service;

import com.cloudthat.productsapp.model.ProductModel;

import java.util.List;

public interface ProductService {
    List<ProductModel> getProducts();

    ProductModel createProduct(ProductModel productModel);
}

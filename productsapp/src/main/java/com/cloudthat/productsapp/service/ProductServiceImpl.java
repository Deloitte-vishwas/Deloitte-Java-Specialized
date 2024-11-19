package com.cloudthat.productsapp.service;

import com.cloudthat.productsapp.entity.Product;
import com.cloudthat.productsapp.model.ProductModel;
import com.cloudthat.productsapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<ProductModel> getProducts() {
        List<Product> productList = productRepository.findAll();
        return productList.stream()
                .map(this::productToProductModel).toList();
    }

    @Override
    public ProductModel createProduct(ProductModel productModel) {
        Product product = productRepository.save(productModelToProduct(productModel));
        return productToProductModel(product);
    }

    private ProductModel productToProductModel(Product product){
        ProductModel productModel = new ProductModel();
        productModel.setId(product.getId());
        productModel.setName(product.getName());
        productModel.setPrice(product.getPrice());
        productModel.setQuantity(product.getQuantity());
        return productModel;
    }

    private Product productModelToProduct(ProductModel productModel){
        Product product = new Product();
        product.setId(productModel.getId());
        product.setName(productModel.getName());
        product.setPrice(product.getPrice());
        product.setQuantity(product.getQuantity());
        return product;
    }
}

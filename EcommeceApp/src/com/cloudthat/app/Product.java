package com.cloudthat.app;

public class Product {
    String productName;
    String color;
    double price;
    int quantity;

    public Product(String productName, int quantity, String color, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.color = color;
        this.price = price;
    }

    public Product() {
        this("Unknown", 0.0);
    }

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public Product(String color, int quantity) {
        this.color = color;
        this.quantity = quantity;
    }
}

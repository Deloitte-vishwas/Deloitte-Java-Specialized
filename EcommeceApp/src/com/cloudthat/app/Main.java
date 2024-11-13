package com.cloudthat.app;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
//        Product p1 = new Product();
//        Product p2 = new Product();
//
//        p1.productName = "Onion";
//        p1.price = 23.5;
//
//        p2.productName = "Wheat";
//        p2.price = 45;

        Product p1 = new Product("Onion", 45.6);
        Product p2 = new Product();

        System.out.println("Product P1 is: "+ p1.getProductName());
        System.out.println("Product P2 is: "+ p2.getProductName());
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.richard.application._min_max_in_lambda_expression_in_java_8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luong
 */
public class Demo {

    public static void main(String[] args) {

        List products = new ArrayList();
        products.add(new Product("p1", "mobile 1", 1000, 2, "Manufacturer 1"));
        products.add(new Product("p2", "mobile 2", 700, 4, "Manufacturer 1"));
        products.add(new Product("p3", "laptop 1", 1200, 6, "Manufacturer 2"));
        products.add(new Product("p4", "laptop 2", 7000, 9, "Manufacturer 2"));
        products.add(new Product("p5", "laptop 3", 2300, 7, "Manufacturer 2"));

        Product max = (Product) products.stream()
                .max((p1, p2) -> (int) (p1.getPrice() - p2.getPrice()))
                .get();
        System.out.println("Product with max price");
        System.out.println(max.toString());

        Product min = (Product) products.stream()
                .min((p1, p2) -> (int) (p1.getPrice() - p2.getPrice()))
                .get();
        System.out.println("Product with min price");
        System.out.println(min.toString());

    }
}

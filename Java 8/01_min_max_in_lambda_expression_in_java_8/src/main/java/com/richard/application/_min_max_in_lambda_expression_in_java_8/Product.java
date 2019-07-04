/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.richard.application._min_max_in_lambda_expression_in_java_8;

/**
 *
 * @author luong
 */
public class Product {

    private String id;
    private String name;
    private long price;
    private int quantity;
    private String manufacturer;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product(String id, String name, long price, int quantity, String manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Id: " + this.id + "\nName: " + this.name + "\nPrice: " + this.price + "\nQuantity: " + this.quantity + "\nManufacturer: " + this.manufacturer;
    }
}

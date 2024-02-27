package com.raulution.KirraShop.entity;

import jakarta.persistence.Id;

public class Clothes {
    @Id
    private int ID;

    public Clothes(int ID) {
        this.ID = ID;
    }

    private double price;
    private int quantity;
    private String name;
    private  String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Clothes(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Clothes(double price, int quantity, String name) {
        this.price = price;
        this.quantity = quantity;
        this.name = name;

    }

    public Clothes() {
    }
}

package com.Attractor;

public abstract class Product {
    private int weight;
    private String name;
    private int qualityOfProduct;
    private double price;

    public Product(int weight, String name, int qualityOfProduct, double price) {
        this.weight = weight;
        this.name = name;
        this.qualityOfProduct = qualityOfProduct;
        this.price = price;
    }



    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQualityOfProduct() {
        return qualityOfProduct;
    }

    public void setQualityOfProduct(int qualityOfProduct) {
        this.qualityOfProduct = qualityOfProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}




package com.Attractor;

public abstract class Product {
    private int weight;
    private String name;
    private double qualityOfProduct;
    private int price;

    public Product(int weight, String name, double qualityOfProduct, int price) {
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

    public double getQualityOfProduct() {
        return qualityOfProduct;
    }

    public void setQualityOfProduct(double qualityOfProduct) {
        this.qualityOfProduct = qualityOfProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}




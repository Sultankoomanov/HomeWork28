package com.Attractor.Products;

import com.Attractor.Product;

public class Fabrics extends Product {
    public Fabrics(int weight, String name, int qualityOfProduct, double price) {
        super(weight, name, qualityOfProduct, price);
    }

    @Override
    public int getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(int weight) {
        super.setWeight(weight);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getQualityOfProduct() {
        return super.getQualityOfProduct();
    }

    @Override
    public void setQualityOfProduct(int qualityOfProduct) {
        super.setQualityOfProduct(qualityOfProduct);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }
}

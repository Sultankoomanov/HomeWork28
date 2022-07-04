package com.Attractor.Products;

import com.Attractor.Product;

public class Paints extends Product {
    public Paints(int weight, String name, double qualityOfProduct, int price) {
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
    public double getQualityOfProduct() {
        return super.getQualityOfProduct();
    }

    @Override
    public void setQualityOfProduct(double qualityOfProduct) {
        super.setQualityOfProduct(qualityOfProduct);
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }
}

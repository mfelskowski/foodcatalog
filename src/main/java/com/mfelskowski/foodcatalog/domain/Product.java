package com.mfelskowski.foodcatalog.domain;

public class Product {
    private ProductType type;
    private Rating rating;

    public Product(ProductType type, Rating rating) {
        this.type = type;
        this.rating = rating;
    }

    public ProductType getType() {
        return type;
    }

    public boolean isHealthy() {
        return rating.hasGoodScore();
    }

    public Rating getRating() {
        return rating;
    }
}

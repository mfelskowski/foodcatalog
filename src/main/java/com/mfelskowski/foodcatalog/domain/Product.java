package com.mfelskowski.foodcatalog.domain;

public class Product {
    private final String name;
    private final ProductType type;
    private final Rating rating;

    public Product(String name, ProductType type, Rating rating) {
        this.name = name;
        this.type = type;
        this.rating = rating;
    }

    public Product(ProductType type, Rating rating) {
        this(type.toString(), type, rating);
    }

    public ProductType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public boolean isHealthy() {
        return rating.hasGoodScore();
    }

    public Rating getRating() {
        return rating;
    }
}

package com.mfelskowski.foodcatalog.domain;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ProductCatalog {
    private Set<Product> products = new HashSet<>();

    public void add(Product product) {
        products.add(product);
    }

    public boolean containsProduct(Product product) {
        return products.contains(product);
    }

    public Set<Product> findProducts(final ProductType productType) {
        return products.stream().filter(p -> p.getType().equals(productType)).collect(Collectors.toSet());
    }
}

package com.mfelskowski.foodcatalog.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertEquals;

public class ConsumerTest {
    private ProductCatalog catalog;

    @Before
    public void setUp() {
        catalog = new ProductCatalog();
    }

    private void addHealthProductToCatalog() {
        catalog.add(new Product(ProductType.ORZECHY_WLOSKIE, new Rating(10.0f, "Very good")));
    }

    @Test
    public void shouldFindProductsIfPresent() {
        addHealthProductToCatalog();

        Set<Product> products = catalog.findProducts(ProductType.ORZECHY_WLOSKIE);

        assertEquals(1, products.size());
    }

    @Test
    public void shouldNotFindProductsIfNotPresent() {
        addHealthProductToCatalog();

        Set<Product> products = catalog.findProducts(ProductType.FASOLA_CZERWONA);

        assertEquals(0, products.size());
    }

    @Test
    public void shouldFindProductWithDetailedRating() {
        addHealthProductToCatalog();

        Set<Product> products = catalog.findProducts(ProductType.ORZECHY_WLOSKIE);

        Rating rating = products.iterator().next().getRating();
        assertEquals(10.0f, rating.getScore(), 0.01f);
        assertEquals("Very good", rating.getComment());
    }
}

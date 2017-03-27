package com.mfelskowski.foodcatalog.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ProductCatalogTest {
    private ProductCatalog catalog;

    @Before
    public void setUp() {
        catalog = new ProductCatalog();
    }

    @Test
    public void shouldAddProductsToCatalog() {
        Product product = ProductGenerator.healthyProduct();
        Product product2 = ProductGenerator.unhealthyProduct();

        catalog.add(product);
        catalog.add(product2);

        assertTrue(catalog.containsProduct(product));
        assertTrue(catalog.containsProduct(product2));
    }

    @Test
    public void shouldFindProductsByType() {
        catalog.add(ProductGenerator.healthyProduct());
        catalog.add(ProductGenerator.unhealthyProduct());
        catalog.add(ProductGenerator.healthyProduct());
        catalog.add(ProductGenerator.unhealthyProduct());
        catalog.add(ProductGenerator.healthyProduct());
        catalog.add(ProductGenerator.unhealthyProduct());

        Set<Product> products = catalog.findProductsByType(ProductType.ORZECHY_WLOSKIE);

        assertEquals(3, products.size());
    }

    @Test
    public void shouldFindProductsByName() {
        catalog.add(ProductGenerator.healthyProduct());
        catalog.add(ProductGenerator.unhealthyProduct());
        catalog.add(ProductGenerator.healthyProduct());
        catalog.add(ProductGenerator.unhealthyProduct());
        catalog.add(ProductGenerator.healthyProduct());
        catalog.add(ProductGenerator.unhealthyProduct());

        Set<Product> products = catalog.findProductsByName("orzechy");

        assertEquals(3, products.size());
    }
}

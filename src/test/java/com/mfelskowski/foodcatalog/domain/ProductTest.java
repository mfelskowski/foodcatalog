package com.mfelskowski.foodcatalog.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ProductTest {

    @Test
    public void shouldCreateProductWithName() {
        Product p = new Product(ProductType.WIORKI_KOKOSOWE, new Rating(3.3f, "Contains sulphur dioxide"));
        assertEquals(ProductType.WIORKI_KOKOSOWE, p.getType());
    }

    @Test
    public void shouldCreateHealthyProduct() {
        Product p = new Product(ProductType.WIORKI_KOKOSOWE, new Rating(5.3f, "Contains sulphur dioxide"));
        assertTrue(p.isHealthy());
    }

    @Test
    public void shouldCreateUnhealthyProduct() {
        Product p = new Product(ProductType.WIORKI_KOKOSOWE, new Rating(3.3f, "Pure coconut chips"));
        assertFalse(p.isHealthy());
    }

}

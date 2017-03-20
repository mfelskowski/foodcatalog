package com.mfelskowski.foodcatalog.domain;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ProductCatalogTest {

    @Test
    public void shouldAddProductsToCatalog() {
        ProductCatalog catalog = new ProductCatalog();
        Product product = new Product(ProductType.WIORKI_KOKOSOWE, new Rating(3.3f, "Contains sulphur dioxide"));
        Product product2 = new Product(ProductType.ORZECHY_WLOSKIE, new Rating(3.3f, "Contains sulphur dioxide"));

        catalog.add(product);
        catalog.add(product2);

        assertTrue(catalog.containsProduct(product));
        assertTrue(catalog.containsProduct(product2));
    }


}

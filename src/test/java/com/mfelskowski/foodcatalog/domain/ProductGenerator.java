package com.mfelskowski.foodcatalog.domain;

public class ProductGenerator {
    private final static float HEALTHY_PRODUCT_SCORE = 10.0f;
    private final static float UNHEALTHY_PRODUCT_SCORE = 0.0f;
    private final static String HEALTHY_PRODUCT_COMMENT = "Very good";
    private final static String UNHEALTHY_PRODUCT_COMMENT = "Contains sulphur dioxide";

    public static Product healthyProduct() {
        return new Product(ProductType.ORZECHY_WLOSKIE, new Rating(HEALTHY_PRODUCT_SCORE, HEALTHY_PRODUCT_COMMENT));
    }

    public static Product unhealthyProduct() {
        return new Product(ProductType.WIORKI_KOKOSOWE, new Rating(UNHEALTHY_PRODUCT_SCORE, UNHEALTHY_PRODUCT_COMMENT));
    }
}

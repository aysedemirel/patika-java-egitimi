package org.ayse.java102.patikastore.product;

public interface Product {
    String getProductInfo();

    String getName();

    default boolean isTheProduct(String productName) {
        return productName.equals(getName());
    }
}

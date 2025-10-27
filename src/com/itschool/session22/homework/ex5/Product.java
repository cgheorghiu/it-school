package com.itschool.session22.homework.ex5;

import java.util.Objects;

public class Product {
    private final String name;
    private final int price;
    private final String id;

    public Product(String name, int price, String id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

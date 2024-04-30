package com.cashwu.javathymeleaf.service;

import com.cashwu.javathymeleaf.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cash.wu
 * @since 2024/04/30
 */
@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }
}

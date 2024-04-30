package com.cashwu.javathymeleaf.controller;

import com.cashwu.javathymeleaf.model.Product;
import com.cashwu.javathymeleaf.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author cash.wu
 * @since 2024/04/30
 */
@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String viewProduct(Model model) {

        List<Product> products = productService.getProducts();

        model.addAttribute("products", products);

        return  "products";
    }

    @PostMapping("/products")
    public String addProduct(@RequestParam String name,
                             @RequestParam double price,
                             Model model) {

        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        productService.addProduct(product);

        List<Product> products = productService.getProducts();
        model.addAttribute("products", products);

        return  "products";
    }
}

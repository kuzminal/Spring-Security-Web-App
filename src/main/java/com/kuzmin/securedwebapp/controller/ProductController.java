package com.kuzmin.securedwebapp.controller;

import com.kuzmin.securedwebapp.domain.Currency;
import com.kuzmin.securedwebapp.domain.Product;
import com.kuzmin.securedwebapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.logging.Logger;

@Controller
@RequestMapping("/product")
public class ProductController {
    private Logger logger =
            Logger.getLogger(ProductController.class.getName());
    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public String add(@RequestParam String name, Model model) {
        Product product = new Product();
        product.name = name;
        product.price = 100;
        product.currency = Currency.EUR;
        productService.save(product);
        model.addAttribute("products", productService.findAll());
        logger.info("Adding product " + name);
        return "main.html";
    }
}

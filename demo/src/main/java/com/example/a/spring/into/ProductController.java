package com.example.a.spring.into;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductController {

    private List<Product> productList = new ArrayList<>();

    @GetMapping("getAllProducts")
    public List<Product> getAll() {

        return productList;
    }

    @GetMapping("{id}")
    public String getById(@PathVariable int id) {
        return "ID = " + id + " bulundu";


    }

    @PostMapping("add")
    public String add(@RequestBody Product product) {
        productList.add(product);
        return "Ürün Eklendi.";
    }


}

package com.example.productapp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @PostMapping("/")
    public String Addpage(){
        return "Welcome to my Add page";
    }
    @PostMapping("/search")
    public String Searchpage(){
        return "Welcome to my search page";
    }

    @PostMapping("/edit")
    public String Editpage(){
        return "Welcome to my edit page";
    }
}

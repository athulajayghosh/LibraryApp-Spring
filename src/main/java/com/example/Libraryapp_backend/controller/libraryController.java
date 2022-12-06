package com.example.Libraryapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class libraryController {
    @PostMapping("/")
    public String Homepage(){
        return "Homepage";
    }

    @PostMapping("/addbook")
    public String addbook(){
        return "Add book Page";
    }

    @PostMapping("/searchbook")
    public String searchbook(){
        return "Search book page";
    }
    @PostMapping("/editbook")
    public String editbook(){
        return "Edit book page page";
    }
    @GetMapping("/viewallbook")
    public String viewallbook(){
        return "View all book page";
    }
    @PostMapping("/deletebook")
    public String deletebook(){
        return "delete book page";
    }
}

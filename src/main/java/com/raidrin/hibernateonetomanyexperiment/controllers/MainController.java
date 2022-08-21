package com.raidrin.hibernateonetomanyexperiment.controllers;

import com.raidrin.hibernateonetomanyexperiment.repositories.CartRepository;
import com.raidrin.hibernateonetomanyexperiment.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private ItemRepository itemRepository;


    @GetMapping("/cart")
    public ResponseEntity<Object> cart() {
        return new ResponseEntity(cartRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/items")
    public ResponseEntity<Object> items() {
        return new ResponseEntity(itemRepository.findAll(), HttpStatus.OK);
    }
}

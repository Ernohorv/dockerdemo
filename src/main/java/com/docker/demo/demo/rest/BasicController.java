package com.docker.demo.demo.rest;

import com.docker.demo.demo.model.Character;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class BasicController {

    @GetMapping("/character")
    public Character getHome() {
        return new Character("Malak", 13, 2);
    }
}

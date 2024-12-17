package com.spring_boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MyRestController {

    @GetMapping("/")
    public Map<String, String> getRootResponse() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello, World!");
        response.put("status", "success");
        return response;
    }

    @GetMapping("/car")
    public Map<String, String> getCarResponse() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "CAR!");
        response.put("status", "success");
        return response;
    }

    // POST Endpoint
    @PostMapping("/submit")
    public Map<String, String> postResponse(@RequestBody Map<String, String> requestBody) {
        // JSON-Antwort erzeugen basierend auf empfangener Anfrage
        Map<String, String> response = new HashMap<>();
        response.put("message", "Data received successfully");
        response.put("status", "success");
        response.put("receivedData", requestBody.toString());
        return response;
    }
}
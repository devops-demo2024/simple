package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
public class TestApi {

    private static final int MIN_VALUE = 200;
    private static final int MAX_VALUE = 500;
    @PostMapping(value = "/testApi")
    public ResponseEntity<Object> testApi() throws InterruptedException {

        Thread.sleep((long)Math.random()*(MAX_VALUE-MIN_VALUE)+MIN_VALUE);
        Map<String,String> map = new HashMap<>();
        return ResponseEntity.status(HttpStatus.OK).body(map);
    }
}

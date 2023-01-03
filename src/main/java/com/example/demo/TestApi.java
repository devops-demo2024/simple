package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestApi {
    @PostMapping(value = "/testApi")
    public ResponseEntity<Object> testApi(){
        Map<String,String> map = new HashMap<>();
        return ResponseEntity.status(HttpStatus.OK).body(map);
    }
}

package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@ResponseBody
public class StatusChecker {
    private String status = "up";

    @PostMapping(value = "/checkDown")
    public ResponseEntity<Object> checkDown(){

        Map<String,String> map = new HashMap<>();
        map.put("status",status);
        if ("down".equals(status)){
            return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(map);
        }
        else {
            return ResponseEntity.status(HttpStatus.OK).body(map);
        }
    }

    @PostMapping(value = "/forceDown")
    public ResponseEntity<String> forceDown(){
        this.status = "down";
        return ResponseEntity.status(HttpStatus.OK).body("force down successfully");

    }

    @PostMapping(value = "/forceUp")
    public ResponseEntity<String> forceUp(){
        this.status = "up";
        return ResponseEntity.status(HttpStatus.OK).body("force up successfully");

    }

}

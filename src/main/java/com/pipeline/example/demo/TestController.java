package com.pipeline.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("getstuff")
    public ResponseEntity<?> getStatus(){

        return new ResponseEntity<>("WE ARE UP AND RUNNING!", HttpStatus.OK);
    }
}
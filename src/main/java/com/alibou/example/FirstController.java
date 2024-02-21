package com.alibou.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
  
  @GetMapping
  public String SayHello() {
    return "Hello from my first controller";
  }
}
package com.alibou.example;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseStatus;


@RestController
public class FirstController {
  
  @GetMapping("/hello")
  public String sayHello() {
    return "Hello from my first controller";
  }
  
  @GetMapping("/hello-2")
  @ResponseStatus(HttpStatus.ACCEPTED)
  public String sayHello2() {
    return "Hello 2 from my first controller";
  }
  
}

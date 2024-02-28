package com.alibou.example;

import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

  @GetMapping("/hello")
  public String sayHello() {
    return "Hello from my first controller";
  }

  @PostMapping("/post")
  public String post(@RequestBody String message) {
    return "Request accepted and message is : " + message;
  }

  @PostMapping("/post-order")
  public String post(@RequestBody Order order) {
    return "Request accepted and message is : " + order.toString();
  }

  @PostMapping("/post-order-record")
  public String postRecord(@RequestBody OrderRecord order) {
    return "Request accepted and message is : " + order.toString();
  }

  // @GetMapping("/hello/{user-name}")
  public String pathVar(@PathVariable("user-name") String userName) {
    return "my value = " + userName;
  }

  @GetMapping("/hello/{user-name}")
  public String paramVar(
      @RequestParam("user-name") String userName,
      @RequestParam("user-lastname") String userLastname) {
    return "my value = " + userName + "   " + userLastname;
  }
}

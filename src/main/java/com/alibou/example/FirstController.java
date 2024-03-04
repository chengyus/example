package com.alibou.example;

import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

  private final StudentRepository repository;

  public FirstController(StudentRepository repository) {
    this.repository = repository;
  }

  @PostMapping("/students")
  public Student post(@RequestBody Student student) {
    return repository.save(student);
  }
}

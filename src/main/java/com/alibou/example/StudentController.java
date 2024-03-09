package com.alibou.example;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {


  private final StudentService studentService;

  public StudentController(StudentService studentService) {
    this.studentService = studentService;
  }

  @PostMapping("/students")
  public StudentResponseDto saveStudent(
    @RequestBody StudentDto dto
  ) {
    return this.studentService.saveStudent(dto);
  }

  @GetMapping("/students")
  public List<Student> findAllStudent() {
    return repository.findAll();
  }

  @GetMapping("/students/{student-id}")
  public Student findStudentById(@PathVariable("student-id") Integer id) {
    return repository.findById(id).orElse(new Student());
  }

  @GetMapping("/students/search/{student-name}")
  public List<Student> findStudentsByName(@PathVariable("student-name") String name) {
    return repository.findAllByFirstnameContaining(name);
  }

  @DeleteMapping("/students/{student-id}")
  @ResponseStatus(HttpStatus.OK)
  public void delete(
    @PathVariable("student-id") Integer id
  ) {
    repository.deleteById(id);
  }
}
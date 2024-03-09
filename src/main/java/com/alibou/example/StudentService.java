package com.alibou.example;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class StudentService {
  private final StudentRepository repository;
  private final StudentMapper studentMapper;

  public StudentService(StudentRepository repository, StudentMapper studentMapper) {
    this.repository = repository;
    this.studentMapper = studentMapper;
  }

  public StudentResponseDto saveStudent(
    StudentDto dto
  ){
    var student = studentMapper.toStudent(dto);
    var savedStudent = repository.save(student);
    return studentMapper.toStudentResponseDto(savedStudent);
  }
}

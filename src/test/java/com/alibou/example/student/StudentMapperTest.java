package com.alibou.example.student;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class StudentMapperTest {

  private StudentMapper mapper;

  @BeforeEach
  void setUp() {
    mapper = new StudentMapper();
  }

  @Test
  public void shouldMapStudentDtoToStudent() {
    StudentDto dto = new StudentDto("John", "Doe", "john@mail.com", 1);

    Student student = mapper.toStudent(dto);

    assertEquals(dto.firstname(), student.getFirstname());
    assertEquals(dto.lastname(), student.getLastname());
    assertEquals(dto.email(), student.getEmail());
    assertNotNull(student.getSchool());
    assertEquals(dto.schoolId(), student.getSchool().getId());
  }

}

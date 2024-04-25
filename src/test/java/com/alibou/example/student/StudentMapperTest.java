package com.alibou.example.student;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

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

  @Test
  public void should_throw_null_pointer_exception_when_studentDto_is_null() {
    assertThrows(NullPointerException.class, () -> mapper.toStudent(null));
  }

  @Test
  public void shouldMapStudentToStudentResponseDto() {
    // Given
    Student student = new Student("Jane", "Smith", "jane@mail.com", 20);
    // When
    StudentResponseDto response = mapper.toStudentResponseDto(student);
    // Then
    assertEquals(response.firstname(), student.getFirstname());
    assertEquals(response.lastname(), student.getLastname());
    assertEquals(response.email(), student.getEmail());
  
  }

}

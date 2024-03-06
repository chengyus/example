package com.alibou.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class School {
  @Id
  @GeneratedValue
  private Integer Id;

  private String name;

  public List<Student> getStudents() {
    return students;
  }

  public void setStudents(List<Student> students) {
    this.students = students;
  }

  @OneToMany(
    mappedBy = "school"
  )
  private List<Student> students;

  public School() {
  }

  public School(String name) {
    this.name = name;
  }

  public Integer getId() {
    return Id;
  }

  public void setId(Integer id) {
    Id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

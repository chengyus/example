package com.alibou.example.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentMapperTest {

  @BeforeEach
  void setUp() {
    System.out.println("Inside the before each method");
  }

  @Test
  public void testMethod1() {
    System.out.println("My first test method");
  }

  @Test
  public void testMethod2() {
    System.out.println("My second test method");
  }
}
package com.alibou.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:custom.properties")
public class MyFirstService {

  private final MyFirstClass myFirstClass;
  @Value("Hello Alibou students")
  private String customProperty;
  @Value("${my.prop}")
  private String customPropertyFromAnotherFile;
  @Value("123")
  private Integer customerPropertyInt;

  public MyFirstService(@Qualifier("bean1") MyFirstClass myFirstClass) {
    this.myFirstClass = myFirstClass;
  }

  public String tellAStory() {
    return "the dependency is saying : " + myFirstClass.sayHello();
  }

  public String getGetCustomPropertyFromAnotherFile() {
    return customPropertyFromAnotherFile;
  }

  public String getCustomProperty() {
    return customProperty;
  }

  public Integer getCustomPropertyInt() {
    return customerPropertyInt;
  }
}

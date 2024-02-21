package com.alibou.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Service;

@Service
@PropertySources({
  @PropertySource("classpath:custom.properties"),
  @PropertySource("classpath:custom-file-2.properties")
})
public class MyFirstService {

  private final MyFirstClass myFirstClass;
  @Value("${my.custom.property}")
  private String customProperty;
  @Value("${my.prop}")
  private String customPropertyFromAnotherFile;
  @Value("${my.prop.2}")
  private String customPropertyFromAnotherFile2;
  @Value("${my.custom.property.int}")
  private Integer customerPropertyInt;

  public MyFirstService(@Qualifier("bean1") MyFirstClass myFirstClass) {
    this.myFirstClass = myFirstClass;
  }

  public String tellAStory() {
    return "the dependency is saying : " + myFirstClass.sayHello();
  }

  public String getCustomPropertyFromAnotherFile() {
    return customPropertyFromAnotherFile;
  }

  public String getCustomProperty() {
    return customProperty;
  }

  public Integer getCustomPropertyInt() {
    return customerPropertyInt;
  }

  public String getCustomPropertyFromAnotherFile2() {
    return customPropertyFromAnotherFile2;
  }
}

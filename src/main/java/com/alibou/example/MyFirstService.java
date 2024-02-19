package com.alibou.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

  private MyFirstClass myFirstClass;
  private Environment environment;

  @Autowired
  public void setMyFirstClass(@Qualifier("bean1") MyFirstClass myFirstClass) {
    this.myFirstClass = myFirstClass;
  }

  public String tellAStory() {
    return "the dependency is saying : " + myFirstClass.sayHello();
  }

  @Autowired
  public void setEnviroment(Environment environment) {
    this.environment = environment;
  }
}

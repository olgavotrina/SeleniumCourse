package ru.stqa.training.selenium;

import org.junit.Test;

public class MyFirstTest extends TestBase{

  @Test
  public void myFirstTest() {
    driver.get("https://www.stackoverflow.com/");
  }

}

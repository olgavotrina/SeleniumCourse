package ru.stqa.training.selenium;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LitecartLogin extends TestBase {

  @Test
  public void litecartLogin() {
    driver.get("http://localhost/litecart/admin/");
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("password")).sendKeys("admin");
    driver.findElement(By.name("login")).click();
    wait.until(ExpectedConditions.titleIs("My Store"));
  }

}

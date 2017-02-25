package com.wip.automation.excercise7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Signin {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.setProperty("webdriver.gecko.driver",
        "/Users/lakshmigopalakrishna/Downloads/geckodriver");
    WebDriver driver = new FirefoxDriver();
    driver.get("https://github.com");
    driver.findElement(By.linkText("Sign in")).click();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    WebElement loginelement = driver.findElement(By.name("login"));
    loginelement.sendKeys("gvtester5");
    WebElement pwelement = driver.findElement(By.name("password"));
    pwelement.sendKeys("googletesting123");
    driver.findElement(By.name("commit")).click();
  }

}

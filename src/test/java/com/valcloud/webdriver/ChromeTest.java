package com.valcloud.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {
    @Test
    public void startWebDriver(){
      WebDriver driver = new ChromeDriver();
      driver.navigate().to("http://seleniumsimplified.com");
      Assert.assertTrue("title should start differently",
        driver.getTitle().startsWith("Selenium Simplified"));
      driver.close();
      driver.quit();
    }
}

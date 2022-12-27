package com.cybertek.tests.day7_Types_Of_Element;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayDemo {

    @Test
    public void test1() throws InterruptedException {
      WebDriver driver = WebDriverFactory.getDriver("chrome");
      driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        WebElement userInput = driver.findElement(By.id("username"));
        Assert.assertFalse(userInput.isDisplayed(),"Verify is NOT DISPLAYED");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[text()='Start']")).click();
        Thread.sleep(5000);

        System.out.println("userInput.isDisplayed() = " + userInput.isDisplayed());
        Assert.assertTrue(userInput.isDisplayed(),"Verify is Displayed");

        driver.quit();
    }
}

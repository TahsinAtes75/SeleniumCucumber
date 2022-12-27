package com.cybertek.tests.day2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TagName {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/sign_up");

        driver.findElement(By.tagName("input")).sendKeys("Tahsin Ates");

        driver.findElement(By.name("email")).sendKeys("atestahsin@gmail.com");

        driver.findElement(By.tagName("button")).click();

        driver.quit();
    }
}

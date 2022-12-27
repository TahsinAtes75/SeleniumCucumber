package com.cybertek.tests.day12_properties_Drivers;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PropertiesTest {

    @Test
    public void test1() {

        String browser = ConfigurationReader.get("browser");
        System.out.println("browser");
        String url = ConfigurationReader.get("url");
        System.out.println(url);
    }

    @Test
    public void test2() {

        WebDriver driver = WebDriverFactory.getDriver(ConfigurationReader.get("browser"));
        driver.get(ConfigurationReader.get("url"));

        String userName = ConfigurationReader.get("userName");
        String password = ConfigurationReader.get("password");

        driver.findElement(By.id("prependedInput")).sendKeys(userName);
        driver.findElement(By.id("prependedInput2")).sendKeys(password+ Keys.ENTER);

//        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        //driver.quit();


    }
}

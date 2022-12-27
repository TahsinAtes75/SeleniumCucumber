package com.cybertek.tests.day12_properties_Drivers;

import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest extends TestBase {

    @Test
    public void OpenBrowserWithConfig() {

        driver.get(ConfigurationReader.get("url"));

        String userName = ConfigurationReader.get("userName");
        String password = ConfigurationReader.get("password");

        driver.findElement(By.id("prependedInput")).sendKeys(userName);
        driver.findElement(By.id("prependedInput2")).sendKeys(password + Keys.TAB);

    }
}
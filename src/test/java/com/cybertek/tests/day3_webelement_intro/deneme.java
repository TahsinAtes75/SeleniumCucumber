package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class deneme {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.facebook.com/");

        String expectedURL = driver.getCurrentUrl();

        WebElement emailInputBox = driver.findElement(By.id("email"));
        String expectedEmail = "atestahsin@hotmail.com";

        emailInputBox.sendKeys(expectedEmail);

        WebElement passwordInputBox = driver.findElement(By.id("pass"));
        String expectedPassword = "934507Unmeta";

        passwordInputBox.sendKeys(expectedPassword);

        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();

        String actualURL = driver.getCurrentUrl();

        }


    }


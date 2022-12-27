package com.cybertek.tests.day2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UrlVerifyChanged {

    public static void main(String[] args){

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        String currentUrlUrl = driver.getCurrentUrl();

        WebElement EmailInputBox = driver.findElement(By.name("email"));

        EmailInputBox.sendKeys("atestahsin@gmail.com");

        WebElement retrievePassword = driver.findElement(By.id("form_submit"));

        retrievePassword.click();
        String expectedURL ="http://practice.cybertekschool.com/email_sent";


        String actualUrl = driver.getCurrentUrl();

        if (expectedURL.equals(actualUrl)){
            System.out.println("PASS");

        }else{
            System.out.println("FAIL");
        }




    }
}

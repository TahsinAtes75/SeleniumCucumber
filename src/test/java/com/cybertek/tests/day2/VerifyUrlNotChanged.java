package com.cybertek.tests.day2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyUrlNotChanged {

    public static void main(String[] args) {
   //Verify Url not Changed

     WebDriver driver = WebDriverFactory.getDriver("chrome");

     driver.get("http://practice.cybertekschool.com/forgot_password");

        String expectedUrl = driver.getCurrentUrl();

        WebElement retrievePassword = driver.findElement(By.id("form_submit"));

        retrievePassword.click();

        String actualUrl = driver.getCurrentUrl();
        if(expectedUrl.equals(actualUrl) ){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        driver.close();
    }
}

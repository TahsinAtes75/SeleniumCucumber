package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLnotChanged {
    public static void main(String[] args) {
      // open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

     // go to  http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        // save expected url after clicking button
        String expectedURL = driver.getCurrentUrl();

    // click on Retrieve Password button
        WebElement retrievePassword = driver.findElement(By.id("form_submit"));
        retrievePassword.click();

        // save actual url after clicking button
        String actualURL = driver.getCurrentUrl();

        // verify that URL did not change

        if(expectedURL.equals(actualURL)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }
         driver.quit();
    }
}

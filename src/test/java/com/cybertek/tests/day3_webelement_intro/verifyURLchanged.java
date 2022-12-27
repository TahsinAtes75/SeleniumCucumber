package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLchanged {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        // enter any email
        WebElement emailInBox = driver.findElement(By.name("email"));
        // sendKeys()--> send keyboard action to the webelement
        emailInBox.sendKeys("atestahsin2011@gmail.com");

        // click retrieve password button
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        Thread.sleep(3000);

        // verify that URL changed to http://practice.cybertekschool.com/email_sent
        String expectedURL ="http://practice.cybertekschool.com/email_sent";

        String actualURL = driver.getCurrentUrl();

        if(expectedURL.equals(actualURL)){
            System.out.println("PASS");

            }else{
                System.out.println("FAIL");
            }
        }





    }



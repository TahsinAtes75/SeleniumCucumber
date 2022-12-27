package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyConfirmationMessage {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailInputBox = driver.findElement(By.name("email"));

        String expectedEmail = "atestahsin2011@gmail.com";

        emailInputBox.sendKeys(expectedEmail);

        String actualEmail = emailInputBox.getAttribute("value");
        System.out.println("actualEmail = " + actualEmail);

        // verify that email is displayed in the input box
        if(expectedEmail.equals(actualEmail)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        // verify that confirmation message says"Your e-mail's been sent!'
        WebElement actualConfirmationMessage = driver.findElement(By.name("confirmation_message"));

        System.out.println(actualConfirmationMessage.getText());

        //save expected message
        String expectedMessage = "Your e-mail's been sent!";
        //save actual message to variable
        String actualMessage = "Your e-mail's been sent!";

        System.out.println(actualConfirmationMessage.getText());

        if(expectedMessage.equals(actualMessage)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedMessage = " + expectedMessage);
            System.out.println("actualMessage = " + actualMessage);
        }
          driver.quit();


    }
}

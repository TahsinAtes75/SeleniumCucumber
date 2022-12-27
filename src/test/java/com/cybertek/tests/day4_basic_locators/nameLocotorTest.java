package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nameLocotorTest {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullNameInput = driver.findElement(By.name("full_name"));
        fullNameInput.sendKeys("TahsinATES");
            //OR Lazy Way
        // driver.findElement(By.name("full_name")).sendKeys("TahsinATES");


        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("atestahsin2011@gmail.com");
              // OR Lazy Way
        //driver.findElement(By.name("email")).sendKeys("atestahsin2011@gmail.com");

        WebElement signUpButton = driver.findElement(By.name("wooden_spoon"));
        signUpButton.click();
               // OR Lazy way
        // driver.findElement(By.name("wooden_spoon")).click();



    }
}

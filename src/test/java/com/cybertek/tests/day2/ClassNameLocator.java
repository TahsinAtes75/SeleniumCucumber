package com.cybertek.tests.day2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassNameLocator {

    public static void main(String [] args){

     WebDriver driver = WebDriverFactory.getDriver("chrome");

     driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement homeButton = driver.findElement(By.className("nav-link"));

        System.out.println("homeButton.getText() = " + homeButton.getText());
        homeButton.click();


        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        System.out.println("getText() = " + driver.findElement(By.name("h3")));


    }
}

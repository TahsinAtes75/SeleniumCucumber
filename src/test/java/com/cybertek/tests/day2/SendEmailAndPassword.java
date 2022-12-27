package com.cybertek.tests.day2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SendEmailAndPassword {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullName = driver.findElement(By.name("full_name"));

        fullName.sendKeys("Tahsin Ates");

        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));

        email.sendKeys("atestahsin@gmail.com");

        driver.findElement(By.name("wooden_spoon")).click();




    }
}

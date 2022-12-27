package com.cybertek.tests.day7_Types_Of_Element;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisableElements {


    @Test
    public void test1(){

      WebDriver driver = WebDriverFactory.getDriver("chrome");
      driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement greenButton = driver.findElement(By.id("green"));

        System.out.println("greenButton.isEnabled() = " + greenButton.isEnabled());

        Assert.assertFalse(greenButton.isEnabled(), "Verify green button is not enable");


        WebElement greenButtonText = driver.findElement(By.xpath("//label[text()='Green']"));

        String expectedText = "Green";
        String actualText = greenButtonText.getText();

        Assert.assertEquals(actualText,expectedText,"Verify that texts are equals");

    driver.quit();
    }


}

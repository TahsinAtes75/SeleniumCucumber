package com.cybertek.tests.day7_Types_Of_Element;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtons {

    @Test
    public void test1() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/radio_buttons");

       // locate radio buttons
        WebElement blueButton = driver.findElement(By.cssSelector("#blue"));
        WebElement redButton = driver.findElement(By.cssSelector("#red"));

        System.out.println("blueButton.isSelected() = " + blueButton.isSelected()); // True
        System.out.println("redButton.isSelected() = " + redButton.isSelected());  // false


//        Assert.assertTrue(blueButton.isSelected(),"blue button is selected");
//        Assert.assertFalse(redButton.isSelected(),"red button is not selected");

        redButton.click();

        Assert.assertTrue(redButton.isSelected(),"red button is selected");
        Assert.assertFalse(blueButton.isSelected(),"blue  button is not selected");
        Thread.sleep(2000);
        driver.quit();

      }
}

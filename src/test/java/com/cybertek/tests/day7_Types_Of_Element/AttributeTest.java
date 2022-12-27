package com.cybertek.tests.day7_Types_Of_Element;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AttributeTest {

    @Test
    public void test1(){
       WebDriver driver = WebDriverFactory.getDriver("chrome");

       driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement redButton = driver.findElement(By.id("red"));
        redButton.click();

        Assert.assertTrue(redButton.isSelected(),"verify red button is selected");

        System.out.println("redButton.getAttribute() = " + redButton.getAttribute("type"));
        System.out.println("redButton.getAttribute() = " + redButton.getAttribute("id"));
        System.out.println("redButton.getAttribute() = " + redButton.getAttribute("name"));

        // Bazen getText ile alamadigimiz text i getAttiribute ile aliyoruz

        driver.quit();




    }


}

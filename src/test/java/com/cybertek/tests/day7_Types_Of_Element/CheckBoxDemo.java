package com.cybertek.tests.day7_Types_Of_Element;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxDemo {

    @Test
    public void test1(){

    WebDriver driver = WebDriverFactory.getDriver("chrome");
    driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement checkBox1 = driver.findElement(By.cssSelector("input[name='checkbox 1']"));
        WebElement checkBox2 = driver.findElement(By.cssSelector("input[name='checkbox2']"));

        WebElement check1 = driver.findElement(By.xpath("//span[text()='Checkbox 1']"));
        WebElement check2 = driver.findElement(By.xpath("//span[text()='Checkbox 2']"));

        System.out.println("checkBox1.isSelected() = " + checkBox1.isSelected());
        System.out.println("checkBox2.isSelected() = " + checkBox2.isSelected());

        checkBox1.click();
        checkBox2.click();

        Assert.assertTrue(checkBox1.isSelected(),"Verify checkbox 1 is selected");
        Assert.assertFalse(checkBox2.isSelected(), "Verify checkbox 2 is NOT SELECTED");


    }


}

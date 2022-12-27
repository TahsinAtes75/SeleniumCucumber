package com.cybertek.tests.day8_TypesOfElement_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDropDown {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {

        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test1() {
        driver.get("http://practice.cybertekschool.com/dropdown");
        // locate your dropdown just like any other Webelement with unique locator
        WebElement dropdownElement = driver.findElement(By.id("state"));

        // 2.Create Select object by passing that elements as a Constructor
        Select stateDropdown = new Select(dropdownElement);

        List<WebElement> options = stateDropdown.getOptions();

        System.out.println("options.size() = " + options.size());

        for (WebElement option : options) {
            System.out.println(option.getText());
        }

    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dropdown");
        // locate your dropdown just like any other Webelement with unique locator
        WebElement dropdownElement = driver.findElement(By.id("state"));

        // 2.Create Select object by passing that elements as a Constructor
        Select stateDropdown = new Select(dropdownElement);

        // verify that first selection is Select a State

        String expectedOption = "Select a State";
        String actualOption = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOption,expectedOption," Verify first Selection");

     // How to Select Option From DropDown?
     // Select Using Visible Text
     Thread.sleep(2000);
     stateDropdown.selectByVisibleText("Virginia");

     expectedOption = "Virginia";
     actualOption = stateDropdown.getFirstSelectedOption().getText();

     Assert.assertEquals(actualOption,expectedOption,"Verify visible Option");

    // Select with Index
        Thread.sleep(2000);
        stateDropdown.selectByIndex(48);

        expectedOption = "Washington";
        actualOption = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOption,expectedOption,"Verify Title");

    // By Value
        Thread.sleep(2000);
        stateDropdown.selectByValue("TX");
        expectedOption = "Texas";
        actualOption = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOption,expectedOption," Verify Title");




    }
}
package com.cybertek.tests.day8_TypesOfElement_2;

import com.cybertek.utilities.WebDriverFactory;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class ListOfElement {

    WebDriver driver;

   @BeforeMethod
   public void setup(){
   driver=WebDriverFactory.getDriver("chrome");

   }
   @AfterMethod
    public void tearDown() throws InterruptedException {

       Thread.sleep(2000);
       driver.quit();

   }

   @Test
   public void test1() throws InterruptedException {
       driver.get("http://practice.cybertekschool.com/multiple_buttons");

       List<WebElement> buttons = driver.findElements(By.tagName("button"));
       System.out.println("buttons.size() = " + buttons.size());


       int expectedSize=6;
       Assert.assertEquals(buttons.size(),expectedSize,"Verify size is 6");
       buttons.get(1).click();


       for (WebElement button : buttons) {
           System.out.println("button.getText() = " + button.getText());

       }
       for (int i = 0; i < buttons.size(); i++) {
           buttons.get(i).click();
           Thread.sleep(2000);

       }
      

   }



}

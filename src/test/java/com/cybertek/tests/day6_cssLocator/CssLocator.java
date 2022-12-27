package com.cybertek.tests.day6_cssLocator;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CssLocator {

    public static void main(String[] args) {

        //Locating Element with id = #(id Value)

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        driver.findElement(By.cssSelector("#disappearing_button"));

        //Locating Element with className = .(class value)
        // className bosluk ile calismaz iken CSS ile bosluk olan yere nokta koyarak locate ederiz

        driver.findElement(By.className("btn btn-primary")).click(); //  calismaz
        driver.findElement(By.cssSelector(".btn.btn-primary\"")).click(); // bu sekilde calisir

        // 2 yol tagName.Value
        driver.findElement(By.cssSelector("button.btn.btn-primary")); // calisir

        //Locating with Element Attribute&Value
        // xpath -> //button[@onclick='button4()']
        // Css ->   button[onclick='button4()']

        driver.findElement(By.xpath("//button[@onclick='button4()']"));

        driver.findElement(By.cssSelector("button[onclick='button4()']"));
        // 2. yol

        driver.findElement(By.cssSelector("[onclick='button4()']")); // tagName olmadan calisir

       // Locating with Starts-with
      // xpath -> //h3[starts-with(class,'h3')],  Css -> h3[class^='h3']
      // ^ bu isaret Css de starts with yerine gecer -> shift 6

      driver.findElement(By.cssSelector("h3[class^='h3']"));

      // Locating with Contains
        //      button[onclick*='5']   -> con


    }
}

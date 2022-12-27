package com.cybertek.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndUrl {
    
    public static void main(String[] args) {
        
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://amazon.com");

        System.out.println("Title = " + driver.getTitle());

         // get Title
        driver.get("http://practice.cybertekschool.com");
        String title = driver.getTitle();
        System.out.println("title Cybertrek  = " + title);

        // get currentUrl

        String currentUrl = driver.getCurrentUrl();
        System.out.println("CurrentUrl : " + currentUrl);

      // get Page Source
         String pageSource = driver.getPageSource();
        System.out.println("PageSource : "  + pageSource);



    }
}

package com.cybertek.tests.day1_webDriverbasic;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class CallWebDriverFactory {
    public static void main(String[] args) {

       WebDriver driver = WebDriverFactory.getDriver("chrome");

       driver.get("https://google.com");

        String title = driver.getTitle();
        System.out.println("title = " + title);
        driver.close();


    }


}

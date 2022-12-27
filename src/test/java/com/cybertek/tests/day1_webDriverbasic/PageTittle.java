package com.cybertek.tests.day1_webDriverbasic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTittle {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        String title = driver.getTitle();
        System.out.println(title);



    }
}

package com.cybertek.tests.day1_webDriverbasic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://cydeo.com");

        Thread.sleep(3000);
        driver.close();

        driver = new ChromeDriver();
        driver.get("http://cydeo.com/open_new_tab");

        Thread.sleep(3000);
        // close current browser

        driver.quit();



    }
}

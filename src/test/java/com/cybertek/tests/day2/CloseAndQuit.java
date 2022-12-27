package com.cybertek.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

    public static void main(String[] args) throws InterruptedException {

      WebDriverManager.chromedriver().setup();

      WebDriver driver = new ChromeDriver();

      driver.get("http://cydeo.com");

        String title = driver.getTitle();
        System.out.println("Title :" + title);

        Thread.sleep(2000);

        //driver.close();

        driver.quit();





    }
}

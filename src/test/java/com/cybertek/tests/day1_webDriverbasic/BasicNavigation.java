package com.cybertek.tests.day1_webDriverbasic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws Throwable{
        // To set up chrome driver
        WebDriverManager.chromedriver().setup();
        // To create an object of chromeDriver class
        ChromeDriver driver=new ChromeDriver();
        String url="http://google.com";
        String url2="http://amazon.com";

       // wait for 3 seconds
        Thread.sleep(3000);
        // will open browser with url
        // open google.com
        driver.get(url);

        Thread.sleep(3000);

       // navigate to amazon.com
        driver.navigate().to(url2);

        Thread.sleep(3000);
        // will back to the previous url
        // in our case it's going to google.com
        driver.navigate().back();

        Thread.sleep(3000);
        // will go to forward

        driver.navigate().forward();
        Thread.sleep(3000);

        // will refresh the page
        driver.navigate().refresh();

        Thread.sleep(3000);

        driver.close();
    }
}

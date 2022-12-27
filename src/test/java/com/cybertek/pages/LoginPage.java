package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
 public LoginPage(){

     PageFactory.initElements(Driver.get(),this);
     // bu classda bulunam elementleri kullanmamiza yardimci olur

 }
    @FindAll({
            @FindBy(id = "prependedInput"),
            @FindBy(name ="_username")
    })
    public WebElement usernameInput;

    @FindBy(id = "prependedInput2")
    public WebElement passwordInput;

    //driver.findElement(By.id("_submit"));
    @FindBy(id = "_submit")
    public WebElement loginBtn;
}

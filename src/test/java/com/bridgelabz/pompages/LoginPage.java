/**
 * Description : LoginPage.java init all webelements and Contains the Methods
 * Author      : Sheetal Chaudhari
 * Date        : 13/01/2020
 */
package com.bridgelabz.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(xpath = "//input[@type='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@type='password' and @id = 'pass']")
    public WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;

    //constructor
    public LoginPage(WebDriver driver) {
        //initialization
        PageFactory.initElements(driver, this);
    }

    //Utilization
    public void setEmail(String userName){
        email.sendKeys(userName);
    }

    public void setPassword(String userPassword){
        password.sendKeys(userPassword);
    }

    public void clicklogin() {
        loginButton.click();

    }
}

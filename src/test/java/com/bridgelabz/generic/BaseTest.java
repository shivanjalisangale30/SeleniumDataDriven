/**
 * Description : BaseTest.java Initialize the Driver and Launch the application by taking the URL from Lib.java
 * Author      : Shivanjali Sangale
 * Date        : 14/01/2020
 */
package com.bridgelabz.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest implements IAutoConstant {

    public WebDriver driver;

    static {
        System.setProperty(CHROME_KEY,CHROME_VALUE);
    }
    @BeforeMethod
    public void openApplication() {
        driver = new ChromeDriver();
        String url = Library.getURLProperty(CONFIGURATION_PATH,"URL");
        driver.manage().window().maximize();
        driver.get(url);
        String implicitTimeOut = Library.getURLProperty(CONFIGURATION_PATH, "ImplicitTimeOut");
        driver.manage().timeouts().implicitlyWait(Long.parseLong(implicitTimeOut), TimeUnit.SECONDS);
    }

    @AfterClass
    public void closeApplication() {
        driver.close();
    }
}

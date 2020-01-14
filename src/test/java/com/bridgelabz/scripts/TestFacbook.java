/**
 * Description : TestFacbook.java -Main test running two test cases
 * Author      : Shivanjali Sangale
 * Date        : 14/01/2020
 */
package com.bridgelabz.scripts;

import com.bridgelabz.generic.BaseTest;
import com.bridgelabz.generic.Library;
import com.bridgelabz.pompages.LoginPage;
import org.testng.annotations.Test;

public class TestFacbook extends BaseTest {

    @Test
    public void testFacebookLoginPage() {
        LoginPage loginPage = new LoginPage(driver);
        System.out.println("Hey facebook");
        String userName = Library.getCellValue(EXCEL_DATA_PATH, "InputData", 1, 0);
        System.out.println("Password"+userName);
        String password = Library.getCellValue(EXCEL_DATA_PATH, "InputData", 1, 1);
        System.out.println(userName);
        System.out.println(password);
        loginPage.setEmail(userName);
        loginPage.setPassword(password);
    }
}

package com.qa.testbase;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class PageInitializer extends BaseClass {
    public static LoginPage loginPage;
    public static HomePage homePage;
    public static void initialize() {
        // initialize pages
         loginPage = new LoginPage();
         homePage = new HomePage();
    }
}

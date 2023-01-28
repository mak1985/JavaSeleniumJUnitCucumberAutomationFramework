package com.qa.pages;

import com.qa.testbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{

    @FindBy(id = "user-name")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "login-button")
    public WebElement loginButton;


    @FindBy(xpath = "//h3[@data-test=\"error\"]")
    public WebElement validateErrorMsg;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

}

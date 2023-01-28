package com.qa.pages;

import com.qa.testbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {

    @FindBy(xpath = "//span[@class='title'][text()='Products']")
    public WebElement validateHomePage;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

}

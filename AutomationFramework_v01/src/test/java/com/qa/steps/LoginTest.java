package com.qa.steps;

import com.qa.utils.CommonUtils;
import com.qa.utils.ConfigsReader;
import io.cucumber.java.en.*;
import org.junit.Assert;
public class LoginTest extends CommonUtils {

    @Given("User on Sauce Demo Login page")
    public void user_on_sauce_demo_login_page() {

    }
    @When("User enters valid username")
    public void user_enters_valid_username() {
        enterText(loginPage.userName, ConfigsReader.getProperty("username"));
    }
    @When("User enters valid password")
    public void user_enters_valid_password() {
        enterText(loginPage.password,  ConfigsReader.getProperty("password"));
    }
    @When("User clicks on login button")
    public void user_clicks_on_login_button() {
        click(loginPage.loginButton);
        wait(2);
    }
    @Then("User should navigated to Sauce Demo home page")
    public void user_should_navigated_to_sauce_demo_home_page() {
        Assert.assertTrue(homePage.validateHomePage.isDisplayed());
    }
}

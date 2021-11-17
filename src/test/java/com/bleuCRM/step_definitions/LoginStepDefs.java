package com.bleuCRM.step_definitions;

import com.bleuCRM.pages.LoginPage;
import com.bleuCRM.utilities.ConfigurationReader;
import com.bleuCRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {
    LoginPage loginpage=new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
    }


    @When("the user enters the valid credentials")
    public void the_user_enters_the_valid_credentials() {
        String username= ConfigurationReader.get("username");
        String password= ConfigurationReader.get("password");
        loginpage.login(username,password);

    }

    @Then("User should see the homepage")
    public void user_should_see_the_homepage() {
        String expected="CRM";
        System.out.println("loginpage.HomePage.getText() = " + loginpage.HomePage.getText());
        Assert.assertTrue((loginpage.HomePage.getText().contains(expected)));
    }



}

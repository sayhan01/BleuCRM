package com.bleuCRM.pages;

import com.bleuCRM.utilities.Driver;
import com.bleuCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }



    @FindBy(name ="USER_LOGIN")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordInput;


    @FindBy(css = ".login-btn")
    public WebElement logInBtn;

    @FindBy(css = "#logo_24_text")
    public WebElement HomePage;



    public void login(String username,String password){

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        logInBtn.click();
    }



}
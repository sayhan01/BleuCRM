package com.bleuCRM.pages;

import com.bleuCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeePage extends BasePage {
    {
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(xpath = "//a[@title='Employees']/span")
    public WebElement employee;
    @FindBy(css= "#top_menu_id_company_3271504278")
    public WebElement company;
    @FindBy(css= ".webform-small-button-text")
    public WebElement addButton;
    @FindBy(xpath = "//input[@id='NAME']")
    public WebElement departmentName;
    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-accept']")
    public WebElement depertmanAddButton;
    @FindBy(xpath = "(//span[@class='structure-dept-block structure-dept-second structure-dept-editable'])[1]")
    public WebElement newDepertmant;
    @FindBy(xpath = "(//span[text()='Find Employee'])[1]")
    public WebElement findEmployee;
    @FindBy(css= "#user-fio")
    public WebElement searchBox;
    @FindBy(xpath = "(//span[text()='Telephone Directory'])[1]")
    public WebElement telephoneDirectory;

    @FindBy(css = ".webform-small-button-text")
    public WebElement sendMessage;

    @FindBy(linkText= "Arben Istrefi")
    public WebElement arow;

    @FindBy(css = ".bx-messenger-textarea-input")
    public WebElement messageText;
}

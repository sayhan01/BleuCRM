package com.bleuCRM.step_definitions;


import com.bleuCRM.pages.EmployeePage;
import com.bleuCRM.utilities.BrowserUtils;
import com.bleuCRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class EmployeeMenuStepDefs {
    EmployeePage employeePage=new EmployeePage();
    @Given("Employee tab")
    public void employee_tab() {

        employeePage.employee.click();
        //Driver.get().findElement(By.xpath("//a[@title='Employees']/span")).click();


    }
    @When("The user clicks company structure")
    public void the_user_clicks_company_structure() {

        employeePage.company.click();

    }
    @Then("The user should be able to display company structure")
    public void the_user_should_be_able_to_display_company_structure() {
       String expectedTitle="Company Structure";
        Assert.assertTrue(Driver.get().getTitle().contains(expectedTitle));
    }
    @When("User should click ADD DEPARTMENT")
    public void user_should_click_ADD_DEPARTMENT() {
        employeePage.addButton.click();
    }

    @When("Enter a department name")
    public void enter_a_department_name() {
        employeePage.departmentName.sendKeys("New Department");

    }
    @When("Click ADD")
    public void click_ADD() {
        employeePage.depertmanAddButton.click();
    }
    @Then("User should display new department")
    public void user_should_display_new_department() {

        Assert.assertTrue(employeePage.newDepertmant.isDisplayed());

    }




    @Given("The user clicks Find Employee")
    public void the_user_clicks_Find_Employee() {

        employeePage.findEmployee.click();
    }

    @Then("User should use searchbox")
    public void user_should_use_searchbox() {

        Assert.assertTrue(employeePage.searchBox.isEnabled());
    }

    @Given("The user clicks Telephone Directory")
    public void the_user_clicks_Telephone_Directory() {

        employeePage.telephoneDirectory.click();
    }

    @When("User should hover over a row and click")
    public void user_should_hover_over_a_row() {
        BrowserUtils.waitFor(2);
        employeePage.arow.click();

    }

    @When("User should click Send Message")
    public void user_should_click_Send_Message() throws InterruptedException {
        employeePage.sendMessage.click();

    }

    @Then("User should be able to see Message Box")
    public void user_should_be_able_to_see_Message_Box() {
        Assert.assertTrue(employeePage.messageText.isEnabled());
    }


}

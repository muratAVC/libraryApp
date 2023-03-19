package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.LibraryPage;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class Step_definition {

    LibraryPage page=new LibraryPage();
    @Given("open the login page")
    public void open_the_login_page() {
        Driver.getDriver().get("https://library2.cydeo.com/login.html");
    }



    @And("click the login button")
    public void clickTheLoginButton() {
        page.logButton.click();
    }

    @And("user can see dashboard")
    public void userCanSeeDashboard() {
        Assert.assertTrue(page.dashboard.isDisplayed());
    }

    @And("enter the user name {string}")
    public void enterTheUserName(String arg0) {
        page.inputNameBox.sendKeys(arg0);
    }

    @And("enter the password {string}")
    public void enterThePassword(String arg0) {
        page.inputPassBox.sendKeys(arg0);
    }
}


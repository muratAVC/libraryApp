package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryPage {

    public LibraryPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "inputEmail")
    public WebElement inputNameBox;

    @FindBy(id = "inputPassword")
    public WebElement inputPassBox;

    @FindBy(xpath = "//*[@class='btn btn-lg btn-primary btn-block']")
    public WebElement logButton;

    @FindBy (xpath = "//a[@class='navbar-brand']")
    public WebElement dashboard;

}

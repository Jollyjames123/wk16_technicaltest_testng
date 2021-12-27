package com.jotform.form.pages;

import com.jotform.form.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Page1HomePage extends Utility {

    public Page1HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//input[@id='first_3'])[1]")
    WebElement fName;

    @FindBy(xpath = "(//input[@id='last_3'])[1]")
    WebElement lName;

    @FindBy(css = "#form-pagebreak-next_5")
    WebElement nextButton;

    public void enterFirstName(String firstName) {
        pmSendTextToElement(fName, firstName);
        Reporter.log("entering first name: " + firstName);
    }

    public void enterLastName(String lastName) {
        pmSendTextToElement(lName, lastName);
        Reporter.log("entering last name: " + lastName);
    }

    public void clickOnNextButton() {
        pmClickOnElement(nextButton);
        Reporter.log("clicking on next button: " + nextButton.toString());
    }
}

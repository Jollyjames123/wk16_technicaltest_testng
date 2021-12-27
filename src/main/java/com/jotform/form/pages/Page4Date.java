package com.jotform.form.pages;

import com.jotform.form.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Page4Date extends Utility {
    public Page4Date() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "form-pagebreak-next_10")
    WebElement nextButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='lite_mode_9']")
    WebElement dateField;

    public void enteringTheDate(String date) {
        Reporter.log("entering the date: " + date);
        pmSendTextToElement(dateField, date);
    }

    public void clickOnNextButton() {
        Reporter.log("clicking on next button: " + nextButton.toString());
        pmClickOnElement(nextButton);
    }
}

package com.jotform.form.pages;

import com.jotform.form.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Page7Submit extends Utility {
    public Page7Submit() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#input_2")
    WebElement submitButton;

    public void clickOnSubmit() throws InterruptedException {
        Reporter.log("clicking on submit button: " + submitButton.toString());
        pmClickOnElement(submitButton);
        Thread.sleep(1000);
    }
}
